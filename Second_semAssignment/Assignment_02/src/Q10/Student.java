package Q10;

public class Student {
	String name;
	int roll;
	public void inputDetails(String name,int roll) {
		this.name=name;
		this.roll=roll;
	}
	public void showDetails() {
		System.out.println("Name of student:- "+name);
		System.out.println("Roll of student:- "+roll);
	}
}
class Test extends Student{
	double marks1;
	double marks2;
	public void inputDetails(double marks1,double marks2) {
		this.marks1=marks1;
		this.marks2=marks2;
	}
	public void showDetails() {
		System.out.println("Student marks1 is:- "+marks1);
		System.out.println("Student marks2 is:- "+marks2);
	}
	
	
	
}
