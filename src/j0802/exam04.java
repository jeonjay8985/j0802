package j0802;

import java.util.Scanner;

public class exam04 {

	public static void main(String[] args) {
		// 실습9-02
		Scanner s1=new Scanner(System.in);
		
		 int num = 0;            // 입력된 숫자가 저장될 변수를 초기화 한다.
	     int sum = 0;            // 입력된 숫자의 각 자리의 합을 저장할 변수를 초기화 한다.
	        
	     System.out.print("숫자를 입력하세요 : ");
	     num = s1.nextInt();
	        
	        while(num!=0){
	          sum += num%10;    //num을 10으로 나눈 나머지를 sum에 더한다.
	          num /= 10;        //num을 10으로 나눈 값을 다시 num에 저장한다.
	        }
	        System.out.println("각 자리수의 합 = "+sum);

	}

}
