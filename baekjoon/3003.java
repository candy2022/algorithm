import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);		
		int[] n = new int[6];
		for(int i=0;i<6;i++) {
			n[i] = scan.nextInt();						
		}	
		int[] chess = new int [6];
		chess[0] = 1; //king
		chess[1]  = 1; //queen
		chess[2] = 2; //rook
		chess[3] = 2; //bishop
		chess[4] = 2; //knight
		chess[5] = 8; //pawn
		for(int i=0;i<6;i++) {
			System.out.print(chess[i]-n[i] +" ");
		}		
		scan.close();
	}
}
