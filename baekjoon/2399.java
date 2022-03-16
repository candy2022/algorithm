import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long sum = 0;
		int N = scan.nextInt();	
		long [] x = new long[N]; 
		for(int i =0; i<N;i++) {
			x[i] = scan.nextInt();			
		}
		for(int i =0; i<N;i++) {
			for(int j=0; j<N; j++) {
				sum += Math.abs(x[i] - x[j]);
			}
		}
		System.out.println(sum);
		scan.close();
	}	
}
