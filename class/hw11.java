package hw11_1;
import java.util.Scanner;

public class Greedy {
	String name;
	int start;
	int end;
		
	public Greedy(String name, int t1, int t2 ) {//생성자 만들기
		this.name = name;
		this.start = t1;
		this.end = t2;		
	}
	public static int schedule(Greedy [] g){ //선정된 회의 수 세기
		
		int time = g[0].start;
		int count = 0;		
		for (int i = 0; i<g.length; i++) {
			if(g[i].start > 6 && g[i].end < 24) {
				if(time <= g[i].start) {
					count = count + 1;
					time = g[i].end;
				}	
			}					
		}
		return count;
	}
  
	public static void scheduleshow(Greedy [] g){ //회의 스케줄 출력하는 메소드
		int time = g[0].start;
		
		for (int i = 0; i<g.length; i++) {
			if(g[i].start >= 6 && g[i].end < 24) { //6시 이상 23시 이하
				if(time <= g[i].start) {				
					//출력하기
					System.out.println(g[i].name + " (" + g[i].start +", "+ g[i].end +")");
					time = g[i].end;
				}	
			}		
		}
    }	
	
	public static void Sort(Greedy[] a) { //삽입 정렬 알고리즘
		for (int i = 1; i < a.length; i++) {
			Greedy standard = a[i];  // 기준
			int loc = i - 1;   		

			while (loc >= 0 && standard.end < a[loc].end) {
				a[loc + 1] = a[loc];
				loc--;
			}
			a[loc + 1] = standard;  //저장

	    }
	}	
	        
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		System.out.print("신청 회의 수 입력: "); 
		int n = scan.nextInt();
		Greedy r[] = new Greedy[n]; //greedy 배열 생성
		
		for(int i=0;i<n;i++) {//입력받기
			
			String a = scan.next();
			int b = scan.nextInt();
			int c = scan.nextInt();
			r[i] = new Greedy(a, b, c);
		}
		Sort(r);//정렬 알고리즘으로 정렬하기
				
		System.out.println("선정된 회의 수 = " + schedule(r));		
		System.out.println("선정된 회의 스케줄 = ");		
		scheduleshow(r); //스케줄 출력하는 메소드 호출하기
		scan.close();
	}
}
