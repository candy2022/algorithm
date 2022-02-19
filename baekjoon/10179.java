import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		for(int i=0;i<N;i++) {			
			double a = scan.nextDouble();
			System.out.printf("$%.2f",a - a*0.2);	
			System.out.println();
		}		
		scan.close();
	}
}
