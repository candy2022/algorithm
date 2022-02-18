import java.util.Scanner;
public class Main {
	public static void main(String[] args){		
		Scanner in = new Scanner(System.in);		
		
		int b1 = in.nextInt();
		int b2 = in.nextInt();
		int d1 = in.nextInt();
		int d2 = in.nextInt();
		int j1 = in.nextInt();
		int j2 = in.nextInt();
		int bes = Math.max(Math.abs(j1-b1) ,Math.abs(j2-b2));
		int dai = Math.abs(j1-d1) + Math.abs(j2-d2);
		if(bes==dai) {
			System.out.println("tie");
		}
		else if(bes>dai) {
			System.out.println("daisy");
		}
		else {
			System.out.println("bessie");
		}
		
		in.close();
	}
}
