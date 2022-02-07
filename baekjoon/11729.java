import java.util.*;
public class Main {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);		 
		int N = in.nextInt();		
		move(N,1,2,3);
		System.out.println(count);
		System.out.println(sb);
	}
    static int count = 0; //횟수 세기   
	public static void move(int n,int i,int j,int k) {
		count ++;		
		if(n==1) { // 원판이 1개일 때
			sb.append(i+ " "+ k +"\n");
		    return;
		}
		
		else { // 원판이 1개가 아닐 때
			move(n-1,i,k,j); 			
			sb.append(i+" "+ k+"\n");			
			move(n-1,j,i,k); 
		}
	}	
}
