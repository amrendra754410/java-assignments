package class_problem;
import java.util.*;
class Book{
	int bookId;
	double price;
	int quantity;
	static double  totalAmount=0;
	Book (int b, double p, int q) {
		this.bookId=b;
		this.price=p;
		this.quantity=q;
		totalAmount += total_cost();
	}
	void displayDetails() {
		System.out.println("Book ID is "+bookId+" Book price is "+price+" Book quantity is "+quantity);
	}
	public double total_cost() {
		return price*quantity;
	
	}
}
public class Q3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		Book b1=new Book(1,10,2);
		b1.displayDetails();
		Book b2=new Book(1,20,4);
		b2.displayDetails();
		Book b3=new Book(1,30,6);
		b3.displayDetails();
		Book b4=new Book(1,40,8);
		b4.displayDetails();
		Book b5=new Book(1,50,10);
		b5.displayDetails();
		System.out.println(Book.totalAmount);

		




		sc.close();
	}
}
		