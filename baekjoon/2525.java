import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		int h = in.nextInt();
		int m = in.nextInt();
		int t = in.nextInt();		
		
		m += t;		
		if(m>=60) {	
			while(m>=60) {
				m -=60;
				h++;
			}
		}								
		if(h>=24)
			h -= 24;		
		
		System.out.println(h + " " + m);
		in.close();
	}
}
