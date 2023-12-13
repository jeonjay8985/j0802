package j0802;


class Student{  
	String name;   
	int no;
	int age;

	
	void print() {
		System.out.printf(" 이름:%s\n 학번:%d\n 나이:%d\n", name, no, age);
      }
}
public class exam10 {

	public static void main(String[] args) {
		// 실습9-08
		
		Student first=new Student();
		first.name="Kim";
		first.no=20170001;
		first.age=29;
		first.print();
		
		Student second=new Student();
		first.name="Hong";
		first.no=20170002;
		first.age=25;
		first.print();
		
		Student third=new Student();
		first.name="Lee";
		first.no=20170003;
		first.age=26;
		first.print();

	}

}
