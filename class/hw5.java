package hw5_1;

import java.util.Scanner;

public class Select {
	static String Selectsort(String[] a,int p,int r,int i) {
		if(p==r)
			return a[p];
		int q = partition(a,p,r);
		int k = q - p + 1;
		if(i<k) {
			return Selectsort(a,p,q-1,i);
		}
		else if(i==k)
			return a[q];
		
		else
			return Selectsort(a,q+1,r,i-k);
	}
	public static int partition(String[] a, int p, int r) {
		String pivot = a[r];
		int i = p-1;
		for(int j =p;j <r;j++) {
			if( a[j].compareToIgnoreCase(pivot)<=0) {
				String temp = a[++i];
				a[i]= a[j];
				a[j] = temp;
			}
		}
		String temp = a[i+1];
		a[i+1] = a[r];
		a[r] = temp;
		return i+1;
	}

	public static void main(String[] args) {
    
		Scanner scan = new Scanner(System.in);
		System.out.print("20개의 단어 입력: ");
		String[] word = new String[20];
		
		for(int i = 0; i< 20; i++) { //단어 입력받기
			word[i] = scan.next();
		}		
		
		System.out.println("1번째 작은 단어 = "+Selectsort(word,0,19,1));
		System.out.println("6번째 작은 단어 = "+Selectsort(word,0,19,6));
		System.out.println("17번째 작은 단어 = "+Selectsort(word,0,19,17));
		System.out.println("20번째 작은 단어 = "+Selectsort(word,0,19,20));
		scan.close();

	}
}
