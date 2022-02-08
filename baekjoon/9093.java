import java.util.Scanner;
public class Main {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);		
		int N = Integer.parseInt(in.nextLine());
		//nextInt를 사용하면 다음줄 입력 건너뜀?
		
		for(int i=0 ;i < N; i++) {				
			String s = in.nextLine();
			
			String[] word = s.split(" "); //문장을 공백 단위로 분리
			
			for(int j = 0; j < word.length; j++) {
				//reverse를 이용하기 위해 StringBuffer 사용
				StringBuffer sb = new StringBuffer(word[j]);
				//StringBuffer를 toString을 이용해서 다시 string으로 변환
				System.out.print(sb.reverse().toString() + " ");
			}
			System.out.println();
		}
		in.close();
	}
}
