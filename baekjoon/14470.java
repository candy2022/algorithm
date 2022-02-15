import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		int temp = in.nextInt();
		int goal = in.nextInt();
		int C = in.nextInt();
		int D = in.nextInt();
		int E = in.nextInt();
		int time=0;
		
		if (temp<0)//온도가 0 미만인 경우
			time = -temp * C + D + goal *E;
		
		else //온도가 0 이상인 경우
			time = (goal-temp) * E;
		
		System.out.println(time);	
		in.close();
	}
}
