import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] antenna = new int[n]; //안테나 개수만큼 배열생성		
		for(int i=0;i<n;i++) {
			antenna[i] = sc.nextInt();			
		}
		Arrays.sort(antenna); //가운데 값을 찾기 위해 정렬
		System.out.println(antenna[(n-1)/2]);
		sc.close();
	}	 
}
