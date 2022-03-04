import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);		
		int people = scan.nextInt();
		int area = scan.nextInt();
		int party = people * area;
		for(int i=0;i<5;i++) {
			int n = scan.nextInt();
			System.out.print(n - party +" ");
		}		
		scan.close();
	}
}
