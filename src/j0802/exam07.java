package j0802;

class T{  
	int no;
	String name;   
	int kor;
	int eng;
	int mat;
	int sum;
	double avg;
	
	void print() {
		System.out.printf(" 학번:%d 이름:%s\n 과목1:%d\n 과목2:%d\n 과목3:%d\n 합계:%d\n 평균:%f\n", no, name, kor, eng, mat, sum, avg);
      }
}
public class exam07 {

	public static void main(String[] args) {
		// 실습9-05
		
		T first=new T();
		first.no=20150001;
		first.name="홍길동";
		first.kor=90;
		first.eng=79;
		first.mat=88;
		first.sum=first.kor+first.eng+first.mat;
		first.avg=first.sum/3.0;
		first.print();
		
		T second=new T();
		second.no=20150002;
		second.name="이순신";
		second.kor=77;
		second.eng=99;
		second.mat=86;
		second.sum=second.kor+second.eng+second.mat;
		second.avg=second.sum/3.0;
		second.print();
		
		T third=new T();
		third.no=20150003;
		third.name="강감찬";
		third.kor=67;
		third.eng=100;
		third.mat=85;
		third.sum=third.kor+third.eng+third.mat;
		third.avg=third.sum/3.0;
		third.print();

	}

}
