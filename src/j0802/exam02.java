package j0802;

public class exam02 {

	public static void main(String[] args) {
		/*
		 오버로딩: 다형성 같은 형식을 안의 매개변수만 다르게
		 오버라이딩: 상위 클래스의 매서드를 하위 클래스에서 정의 새로 하는것
		 ex. upspeed/ downspeed로 상위클래스에서 정의했던 것을 하위 클래스에서 재정의 가능
		 */
		try {
		int a[] = new int[3];
		a[3]=100;
		int num1=100;
		int num2=1;
		int result=num1/num2;
		
		
	} catch(Exception e) {
		System.out.println("예외 에러가 발생했습니다 "+e.getMessage());  //모든 에러처리에 대응 가능
	}
		
	/*	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("배열 범위를 벗어났습니다");  //try에서 구문수행하다 에러 만나면 catch문으로 넘어감!
	
	} catch (ArithmeticException e) {
		System.out.println("0으로 나눌 수 없습니다");
	}*/
		finally {
			System.out.println("무조건 수행됩니다");    //에러가 있어도 없어도 무조건 수행.
		}
  }
}
