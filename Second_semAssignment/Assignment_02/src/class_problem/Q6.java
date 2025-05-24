package class_problem;

class Vechile{
	String model;
	int year;
	Vechile(String model,int year){
		this.model=model;
		this.year=year;
	}
}
class Car1 extends Vechile{
	int carID;
	double price;
	Car1(String m,int y,int id, double p){
		super(m,y);
		this.carID=id;
		this.price=p;
	}
	void display() {
		System.out.println("Model of car is "+model);
		System.out.println("Year of car is "+year);
		System.out.println("Car ID of car is "+carID);
		System.out.println("Price of car is "+price);
	}	
}
public class Q6 {
	public static void main(String args[]) {
		Car1 c = new Car1("XUV",2024,321,2400000);
		c.display();
	}
}


