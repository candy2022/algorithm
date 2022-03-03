import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);		
		int sec = 0;
		for(int i=0;i<4;i++) {
			int n = scan.nextInt();
			sec += n;			
		}	
		System.out.println(sec/60);//분
		System.out.println(sec%60);//초
		scan.close();
	}
}
