import java.util.Scanner;
public class b5522 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;				
		for(int i =0; i<5;i++) {
			int n = scan.nextInt();
			sum += n;
		}
		System.out.println(sum);
	}
}
