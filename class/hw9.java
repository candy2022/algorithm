package hw9_1;
import java.util.Scanner;
public class Lcs {

    public static int LCS(char [] m , char [] n) {
 
		int[][] c = new int[m.length+1][n.length+1];
		
		for(int i=1;i<=m.length;i++) {
			for(int j=1;j<=n.length;j++) {
				
				if(m[i-1] == n[j-1]) { // m n번을 을 반복하면서 하나씩 계산한다
					c[i][j] = c[i-1][j-1] + 1;
				
				}else {
					c[i][j] = Math.max(c[i-1][j],c[i][j-1]);
				}
			}
		}		
		return c[m.length][n.length];
		
    }
   
  
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		System.out.print("첫번째 문자열 입력: "); 
		char[] s1 = scan.nextLine().toCharArray(); //첫 번째문자 입력받기
		System.out.print("두번째 문자열 입력: "); 
		char[] s2 = scan.nextLine().toCharArray();//두 번째 문자 입력받기
		System.out.print("LCS 길이: = ");
		System.out.println(LCS(s1, s2)); //출력하기
		
		scan.close();
	}
}

