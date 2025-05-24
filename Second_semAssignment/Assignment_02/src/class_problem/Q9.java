package class_problem;

class Employee{
	String name;
	int salary;
	Employee(String name,int salary){
		this.name=name;
		this.salary=salary;
	}
	void displayempoyeeInfo() {
		System.out.println("Name of Employee:- "+name);
		System.out.println("Salary of Employee:- "+salary);
	}
}
class Manager extends Employee{
	String department;
	Manager(String name,int salary,String dept){
		super(name,salary);
		this.department=dept;
	}
	void displaymaanaagerdetails() {
		super.displayempoyeeInfo();
		System.out.println("Name of Department:- "+ department);
	}
}
public class Q9 {
	public static void main(String args []) {
		Manager m=new Manager("Varsha",100,"NEET");
		Employee e=new Employee("Ayush", 5);
		m.displaymaanaagerdetails();
		e.displayempoyeeInfo();

		




		

	}
	
}
