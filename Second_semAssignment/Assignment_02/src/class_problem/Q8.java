package class_problem;

interface flyable{
	public void fly();
}
interface swimable{
	public void swim();
}

class Duck implements flyable, swimable{
	String name;
	public void fly() {
		System.out.println("Can fly");
		
	}

	public void swim() {
		System.out.println("can swim");
		
	}
	Duck(String name){
		this.name = name;
	}
	void displayDetails() {
		System.out.println(name + "Can fly and can swim");
	}
	
}

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck d=new Duck("ABC");
		d.displayDetails();
		

	}

}
