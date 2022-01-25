public class hanoi {
	public static void main(String[] args){
		move(3,'A','B','C');
	}
    static int count = 1; //횟수 세기   
	public static void move(int disk,char source,char dest,char a) {
				
		if(disk==1) { // 원판이 1개일 때
			
			System.out.println(count + ":"+disk+" 이동: from "+source+" to "+dest);
		    count ++;
		}
		
		else { // 원판이 1개가 아닐 때
			move(disk-1,source,a,dest); 			
			System.out.println(count +":"+disk+" 이동: from "+source+" to "+dest);
			count ++;
			move(disk-1,a,dest,source); 
		}
	}	
}
