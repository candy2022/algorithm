import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] card = new int [n];
		int sum = 0;
		int max = 0;
		for(int i=0;i<n;i++) {
			card[i] = scan.nextInt();			
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					sum = card[i]+card[j]+card[k];
					if(sum > max && sum <= m)
						max = sum;
				}
			}
		}		
		System.out.println(max);		
		scan.close();
	}
}
