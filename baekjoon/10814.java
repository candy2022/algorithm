import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[][] user = new String[n][2];
    
		for (int i = 0; i < n; i++) {
			user[i][0] = sc.next();
			user[i][1] = sc.next();			
		}
    
		Arrays.sort(user,new Comparator<String[]>() {
			@Override
			public int compare(String[] a, String[]b) {
				return Integer.parseInt(a[0]) - Integer.parseInt(b[0]);
			}
		});
    
		for (int i = 0; i < n; i++) {
			System.out.println(user[i][0] +" "+ user[i][1]);
		}
	}
}
