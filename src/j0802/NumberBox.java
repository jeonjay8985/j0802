package j0802;

public class NumberBox {
	public int ivalue=10;
    public float fvalue=(float)1.2345;
	
	void print() {    
		System.out.printf(" %d\n %.4f\n", ivalue, fvalue);
	}

	public static void main(String[] args) {
		// 실습9-07
		
		NumberBox nb= new NumberBox();
		nb.print();

	}

}
