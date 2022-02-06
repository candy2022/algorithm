import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		int num;
		int fact = 1;
		Scanner a = new Scanner(System.in);
		num = a.nextInt();
		
		for(int i = 1;i<num+1;i++) {
			fact = fact * i;
		}
		System.out.println(fact);		
	}
}
