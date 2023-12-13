package j0802;

import java.util.Scanner;

public class exam06 {

	public static void main(String[] args) {
		// 실습9-04
		
		Scanner s1=new Scanner(System.in);
		
		System.out.printf("##교환할 돈은? ");
		int money = s1.nextInt();		
		int a = money/500;
		int b = (money%500)/100;
		int c = (money%100)/50;
		int d = (money%50)/10;
		int e = (money%10);
		System.out.printf("오백원짜리 ==> %d개\n", a);
		System.out.printf("백원짜리 ==> %d개\n", b);
		System.out.printf("오십원짜리 ==> %d개\n", c);
		System.out.printf("십원짜리 ==> %d개\n", d);
		System.out.printf("바꾸지 못한 잔돈 ==> %d원\n", e);
		

	}

}
