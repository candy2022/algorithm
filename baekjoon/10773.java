import java.util.Scanner;
import java.util.Stack;
public class Main {
	public static void main(String[] args){		
		Scanner in = new Scanner(System.in);
		
		Stack<Integer> stack = new Stack<Integer>();
		int k = in.nextInt();
		for(int i=0;i<k;i++) {
			int num = in.nextInt();
			if(num ==0) { //0일 경우 삭제
				stack.pop();
			}
			else
				stack.push(num);
		}		
		in.close();
		int sum =0;		
		for(Integer i: stack)
			sum+= i;
		System.out.println(sum);
	}
}
