import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] c = new int [n];
		
		for(int i=0;i<n;i++) {
			c[i] = scan.nextInt();			
		}
		int count = 0;		
			
		while(n!=1) {	//후보자가 1명이 아닐경우
			int max =0;
            for(int i=0;i<n;i++){
                if(c[i]>=c[max])//가장 큰 후보자의 위치
                    max = i;
            }
            if(max ==0){ //다솜(0번)이 max이면 
                break;
            }		
            c[0]++; //다솜의 득표수를 1 올린다
            c[max]--; //득표수가 가장 많은 사람의 표를 1 뺀다
		      	count++; //표가 움직인 횟수
						
		}		
		System.out.println(count);		
		scan.close();
	}
}
