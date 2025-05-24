package Assignment_02;
class Car{
	String model;
	int year;
	void setDetails(String model,int year) {
	this.model=model;
	this.year=year;
	}
	void displayDetails() {
		System.out.println("Model of car is "+model);
		System.out.println("Year of car is "+year);
		
	}
}

public class Q1 {
	public static void main(String[] args) {
		Car c=new Car();
		c.setDetails("Mahindra", 2024);
		c.displayDetails();
		Car c1=new Car();
		c1.setDetails("Tata",2024);
		c1.displayDetails();
		
	}

}
