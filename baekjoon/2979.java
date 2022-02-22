import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int[] t = new int[101];
		int min =0;
		int max = 0;
		int sum = 0;
		for(int i=0;i<3;i++) {
			int in = scan.nextInt();
			int out = scan.nextInt();
			min = Math.min(min, in); //처음 트럭이 들어온 시간
			max = Math.max(max, out);//마지막 시간
			for(int j=in;j<out;j++) {
				t[j]++; //트럭이 들어온 시간에 +1
			}	
		}
		for(int i=min;i<max;i++) {
			if(t[i] == 1) sum = sum + a; //트럭이 1대일때
			if(t[i] == 2) sum = sum + b*2;
			if(t[i] == 3) sum = sum + c*3;
		}
		System.out.println(sum);
		scan.close();
	}
}
