import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for(int i=0;i<n;i++) {
			x[i] = scan.nextInt();
			y[i] = scan.nextInt();
		}		
		for(int i=0;i<n;i++) {
			int count = 0;
			for(int j=0;j<n;j++) {
				if(x[i]<x[j] && y[i]<y[j])//x와 y 모두 i번째 보다 크면					
					count++;
			}
			
			System.out.print(count+1 +" ");
		}
	
		scan.close();
	}
}
