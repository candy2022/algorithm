package hw0_2;

import java.util.Scanner;

public class Main {	
	static int num;
	static int factorial(int n){ //factorial method
		
		if (n == 1) //Returns 1 if n is 1
			return 1;
		else //If n is greater than 1, it returns by repeatedly multiplying n and n-1, which are constantly changing.
			return n*factorial(n-1);		
	}
  
	static void show(int n){ //show method		
		if(n >1) // print until n becomes 1.
			show(n-1);
		    System.out.print(n+" ");
	}
  
	public static void main(String[] args) { //main method
		
		Scanner scan = new Scanner(System.in);	
		System.out.print("Enter positive integer n: ");
		num = scan.nextInt();		
		System.out.println("\nfactorial(" +num +") = " + factorial(num));
		System.out.print("show("+num+") = "  );
		show(num);
		scan.close();

	}	
}
