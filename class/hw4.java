package hw4_1;

import java.util.Scanner;

public class Main {// main class		

	    private static void quickSort(String w[], int p, int r) { //quickSort 메소드
	        if(r <= p) return;
	        int j = partition(w, p, r); //분할
	        quickSort(w, p, j-1);  // 왼쪽 부분 호출
	        quickSort(w, j+1, r); //  오른쪽 부분 호출
	    }
	    private static int partition(String w[], int p, int r) { //
	        int i = p+1;
	        int j = r;
	        
	        while (true) { 
	            while(i < r && (w[i]).compareToIgnoreCase(w[p]) <= 0) i++; //문자를 비교
	            while(j > p && (w[p]).compareToIgnoreCase(w[j]) <= 0) j--; 
	           
	            if(i >= j) break;
	            
	            String temp = w[i]; //i 와 j를 교환
		        w[i] = w[j];
		        w[j] = temp;
	        }	       
	        String temp = w[p]; //기준 원소와 첫 원소 교환
	        w[p] = w[j];
	        w[j] = temp;
	        
	        return j;
	    }	
	  
	public static void main(String[] args) { //main method
		
		Scanner scan = new Scanner(System.in);
		System.out.print("단어 수 입력: "); 
		int n = scan.nextInt(); //단어 수 입력받기
		
		String[] word = new String[n];
		System.out.print(n + "개의 단어 입력 : "); 
		
		for(int i = 0; i< n; i++) { //단어 입력받기
			word[i] = scan.next();
		}		
		
		quickSort(word,0,n-1);
		System.out.print("퀵 정렬 결과 = ");		
		for(int i = 0; i < n;i++) { //배열 출력하기
			System.out.print(word[i]+" ");
		}
		scan.close();
	}	
}

