package Class_problem;
import java.util.*;
class Student{
	int marks;
	String name;
	void setData(String n,int m) {
		marks=m;
		name=n;
	}
	void print() {
		System.out.println("Name of the student: "+name);
		System.out.println("Marks of the student: "+marks);
	}
}

class MarksOutOfBoundException extends Exception{
	MarksOutOfBoundException(String Message){
		super(Message);
	}
}
public class Q3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the marks of the student: ");
		int marks=sc.nextInt();
		try {
			if(marks>100) {
				throw new MarksOutOfBoundException("Marks is always less than 100");
				}
		}catch (MarksOutOfBoundException e) {
				System.out.println(e.getMessage());
		}
			
	}
		
}
	

