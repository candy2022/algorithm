
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String ans="";
		while(true) {			
			String n = scan.next();			
			if(n.equals("0"))
				break;
			else {
				for(int i=n.length()-1;i>=0;i--) {					
					if(n.charAt(i) != n.charAt(n.length()-1-i)) {
						ans = "no";			
						break;
					}
					else
						ans = "yes";
				}				
			}
			System.out.println(ans);
		}
		scan.close();
	}
}
