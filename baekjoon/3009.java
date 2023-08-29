import java.util.*;
 
class Main { 
	public static void main(String[] args)
	{ 
		 Scanner scan = new Scanner(System.in);
		  
		 int a,b;
		 int[] x = new int[3];
		 int[] y = new int[3];
		 
		 for(int i=0;i<3;i++) {
			 
			  x[i] = scan.nextInt();
			  y[i] = scan.nextInt();
		 }
		 Arrays.sort(x);
		 Arrays.sort(y);
		 
		if(x[0] == x[1]) 
			a = x[2];
		
		else if(x[0]==x[2])
			a = x[1];
		else
			a=x[0];
		
		if(y[0] == y[1]) 
			b = y[2];		
		else if(y[0]==y[2])
			b = y[1];
		else
			b=y[0];
		System.out.printf("%d %d",a,b);
		
		
					
			
			
		 scan.close();
	}		
}
