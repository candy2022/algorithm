import java.util.Scanner;
public class Main {
	public static void main(String[] args){		
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		Integer[] zero = new Integer[41];
		Integer[] one = new Integer [41];
		zero[0] = 1; one[0]=0;
		zero[1] = 0; one[1]=1;
    
		for(int j=2;j<41;j++) {
			zero[j] = zero[j-2] + zero[j-1];
			one[j] = one[j-2] + one[j-1];
		}
		for(int i=0;i<T;i++) {			
			int num = in.nextInt();				
			System.out.println(zero[num] +" "+one[num]);			
		}		
		in.close();
	}
}
