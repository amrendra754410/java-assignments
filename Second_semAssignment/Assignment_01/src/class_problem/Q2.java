package class_problem;
import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter person Weight in kg: ");
		double mass=sc.nextDouble();
		System.out.print("Enter height of person in meter: ");
		double height=sc.nextDouble();
		double bmi=mass/(height*height);
		String output=null;
		if(bmi<18.5) {
			output="Underweight";
		}
		else if(bmi<24.9) {
			output="Normal Weight";
		}
		else if(bmi<29.9) {
			output="Overweight";
		}
		else {
			output="Obese";
		}
		System.out.println("The person is "+output+".");


		sc.close();
	}

}
