package j0802;

class Dog{
	String breed;
	String color;
	int age;

	
	void eat() {
		System.out.println("진돗개가 배가 고프다");
	}
	
	void sleep() {
		System.out.println("진돗개가 잔다");
	}
	
	void meow() {
		System.out.println("진돗개가 짓는다");
	}
	
	void print() {    
		System.out.printf(" 종: %s\n 나이: %d\n 색: %s\n", breed, age, color);
	}
	
}


public class exam12 {

	public static void main(String[] args) {
		// 실습9-10
		
		Dog dog1 = new Dog();    
		dog1.breed="진돗개";
		dog1.age=3;
		dog1.color="흰색";
		dog1.print();
		dog1.meow();
		dog1.sleep();
		dog1.eat();
		

		

	}

}
