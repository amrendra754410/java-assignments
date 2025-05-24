package class_problem;
import java.util.*;
class Car{
	String model;
	int year;
	void setDetails(String m,int y) {
		model=m;
		year=y;
	}
	void displayDetails() {
		System.out.println("Model of car: "+model);
		System.out.println("year of car: "+year);	
	}
}
public class Q1 {
	public static void main(String args []) {
		Car c1=new Car();
		c1.setDetails("Toyota",2025);
		c1.displayDetails();
		Scanner sc=new Scanner(System.in);
		Car c2=new Car();
		System.out.print("Enter the model of car and year ");
		c2.setDetails(sc.nextLine(), sc.nextInt());
		c2.displayDetails();
		if(c1.year>c2.year) {
			System.out.println(c1.model+" is newer.");
		}
		else if(c1.year<c2.year) {
			System.out.println(c2.model+" is newer.");
		}
		else
			System.out.println("Both "+c1.model+" and "+c2.model+" is manufacter in same year.");
			
			




		sc.close();
	}

}
