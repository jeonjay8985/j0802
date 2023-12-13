package j0802;

class Goods{
	String name;           
	int price;
	int stock;
	int sold;
	
	void print() {
		System.out.printf(" 상품이름: %s\n 상품가격: %d\n 재고수량: %d\n 팔린수량: %d\n", name, price, stock, sold);
		
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getSold() {
		return sold;
	}

	public void setSold(int sold) {
		this.sold = sold;
	}
}
public class exam08 {

	public static void main(String[] args) {
		// 실습9-06
		
		
		Goods g1=new Goods();
		Goods g2=new Goods();		
		Goods g3=new Goods();
		
		g1.setName("Nikon"); 
        g1.setPrice(400000);      
        g1.setStock(30); 
        g1.setSold(50);    
        
    	g2.setName("Samsung"); 
        g2.setPrice(1100000);      
        g2.setStock(50); 
        g2.setSold(30);   
        
    	g3.setName("Apple"); 
        g3.setPrice(900000);      
        g3.setStock(110); 
        g3.setSold(70);   
        
        
        
        
        
        g1.print();
		g2.print();
		g3.print();
	

	}

}
