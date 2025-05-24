package Assignment_02;
class Book{
	int bookId;
	double price;
	int quantity;
	static double totalamt;
	Book(int bookId,double price,int quantity){
		this.bookId=bookId;
		this.price=price;
		this.quantity=quantity;
		totalamt += cost();
	}
	void displayDetails(){
		System.out.println("Book id : "+bookId);
		System.out.println("Book price : "+price);
		System.out.println("Book Quantity : "+quantity);
	}
	public double cost() {
		return price*quantity;
	}
	
	
}
public class Q3 {
	public static void main(String[] args) {
		Book b1=new Book(001,500,5);
		b1.displayDetails();
		Book b2=new Book(002,1000,10);
		b2.displayDetails();
		System.out.println(b1.totalamt);
		System.out.println(b2.totalamt);
	}

}
