package j0802;


class Rectangle{    
	
	int width;
	int length;
	int area=width*length;
	int size=2*(width+length);
	

	void print() {    
		System.out.printf(" 가로: %d\n 세로: %d\n 면적: %d\n 둘레: %d\n", width, length, area, size);
	}


}


public class exam11 {

	public static void main(String[] args) {
		// 실습9-09
	
	 Rectangle rec=new Rectangle(); 
            rec.width=10;
            rec.length=20;
            rec.area=rec.width*rec.length;
            rec.size=2*(rec.width+rec.length);
            rec.print();
            
            
            
            
	}  
   
}

