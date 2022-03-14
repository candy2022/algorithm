import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int N = n;
		int count = 0;
		int newn =0;
		
		while(true) {
			newn = n/10 + n%10;
			n = (n%10)*10 + newn%10; //n의 오른쪽수를 십의자리수로 만들고 newn의 오른쪽수를 더한다.
			count ++;
			if (n == N) break;
		}
		System.out.println(count);
	}
}

