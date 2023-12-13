package j0802;

public class Calculator {

	public int sum(int num1, int num2) {
		return num1+num2; 
	}

	public int mul(int num1, int num2) {
		return num1*num2; 
}
	
	 public int for1(int num1, int num2) {
		 int sum=0;
		 for(int i=num1 ; i<=num2; i++) {
			 sum=sum+i;
	 }
		 return sum;
   }
}