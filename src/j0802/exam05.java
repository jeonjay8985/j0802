package j0802;

import java.util.Scanner;

public class exam05 {

	public static void main(String[] args) {
		// 실습9-03
		
		Scanner s1 = new Scanner(System.in);
		int num1;
		int num2;
		
		
		while(true){
		
		 System.out.print("계산할 첫번째 숫자 입력 : ");
		 num1= s1.nextInt();
		  if(num1==999) {
			   break;}
		 System.out.print("계산할 두번째 숫자 입력 : ");
		 num2= s1.nextInt();
		 System.out.print("계산할 연산자 입력 : ");
		 String str=s1.next();
		

	   if (str.equals("+")) {
		   System.out.println(" " + num1 +" + "+ num2 + " = "+ (num1 + num2)+ " 입니다");
	   }
	   else if (str.equals("-")) {
		   System.out.println(" " + num1 +" - "+ num2 + " = "+ (num1 - num2)+ " 입니다");
	   }
	   else if (str.equals("*")) {
		   System.out.println(" " + num1 +" * "+ num2 + " = "+ (num1 * num2)+ " 입니다");
	   }
	   else if (str.equals("/")) {
		   System.out.println(" " + num1 +" / "+ num2 + " = "+ (num1 / num2)+ " 입니다");
	   }
	   else if(str.equals("%")) {
		   System.out.println(" " + num1 +" % "+ num2 + " = "+ (num1 % num2)+ " 입니다");
	   }
	   
	 
	   }
	
	   }
     }	
	
   
/*
while(true) {
	System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.몫");
	System.out.println("종료 하시려면 1~5제외  아무키를 입력하세요.");
	int act = s1.nextInt();
	if(act == 1 ) {
		System.out.println(num1 +" + "+ num2 + " = "+ (num1 + num2)+ " 입니다");
	} else if (act == 2 ) {
		System.out.println(num1 +" - "+ num2 + " = "+ (num1 - num2)+ " 입니다");		
	} else if (act == 3 ) {
		System.out.println(num1 +" * "+ num2 + " = "+ (num1 * num2)+ " 입니다");
	} else if (act == 4 ) {
		System.out.println(num1 +" / "+ num2 + " = "+ (num1 / num2)+ " 입니다");				
	} else if (act == 5) {
		System.out.println(num1 +" % "+ num2 + " = "+ (num1 % num2)+ " 입니다");		
	} else {
		System.out.println("종료합니다.");
		break; 
	}

*/
	



		
		/*

		System.out.println("=== 계산기 프로그램 ===");
		System.out.print("연산자 입력 ( + , - , * , / )  : ");

		String s = s1.nextLine();
		while(true) {

			System.out.print("첫 번째 숫자를 입력 하세요. : ");
			int one = Integer.parseInt(s1.next());

			System.out.print("두 번째 숫자를 입력 하세요. : ");
			int two = Integer.parseInt(s1.next());

			System.out.println("===== 결과 =====");
			System.out.println();
			

			if(s.contentEquals("+")) {
				System.out.println(" " + one +" + "+ two + " = "+ (one + two));

			}else if(s.contentEquals("-")) {
				System.out.println(" " + one +" - "+ two + " = "+ (one - two));

			}else if(s.contentEquals("*")) {
				System.out.println(" " + one +" * "+ two + " = "+ (one * two));

			}else if(s.contentEquals("/")) {
				System.out.println(" " + one +" / "+ two + " = "+ (one / two));

			}else {
				System.out.println(" 연산자를 다시 선택해주세요.");
			}
            */
	   
	

