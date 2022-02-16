import java.util.*;
//18130
public class Main {

	public static void main(String[] args) {
			
		int num,min,count;
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int time=sc.nextInt();		
		int[] result = new int[N];
		for(int i=0;i<N;i++) {	
			int p = sc.nextInt();
			int k =sc.nextInt();
			int c = sc.nextInt();
			
			if(time%k==0) {
				num = time/k-1;
			}
			else
				num = time/k;
			result[i] = p + num*(num+1)/2 * c;	
		}				
		min = result[0];
		count = 0;
		for (int i = 1; i < N; i++) {
			if (min > result[i]) {
				min = result[i];
				count = i;
			}			
		}
	
		System.out.printf("%d %d",count+1 , min );
		sc.close();
	}

}
