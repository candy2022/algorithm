import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		int b1 = in.nextInt();
		int b2 = in.nextInt();
		int b3 = in.nextInt();
		int ci = in.nextInt();
		int co = in.nextInt();
		
		int bur = Math.min(Math.min(b1, b2), b3);
		int drink = Math.min(ci,co);
		System.out.println(bur + drink - 50 );		
		
		in.close();
	}
}
