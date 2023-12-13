package j0802;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {
		// 실습9-01
		
		Scanner s1=new Scanner(System.in);
		
	
		System.out.print("## 계산할 초는? ");
		int num=s1.nextInt();
		
		int hour;
		int minute;
        int second;
        
		hour=num/60/60;
		minute=num/60%60;
		second=num%60;
        
		
		System.out.println("시간은 ===>" +hour);
		System.out.println("분은 ===>" +minute);
		System.out.println("초는 ===>" +second);

	}

}
