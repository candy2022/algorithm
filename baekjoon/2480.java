import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);		
		int a = in.nextInt();	
		int b = in.nextInt();
		int c = in.nextInt();		
		int r = 0;
		
		if(a==b && b==c) {
			r = 10000+ a*1000;
		}
		else if(a==b || b == c) {			
			r = 1000 + b*100;
		}
		else if(a==c) {
			r = 1000+ a*100;						
		}
		else {
			int ma = Math.max(Math.max(a, b), c);
			r = ma * 100;
		}
		System.out.println(r);		
		in.close();
	}
}
