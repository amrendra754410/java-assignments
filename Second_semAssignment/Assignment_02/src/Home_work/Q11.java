package Home_work;
import java.util.Scanner;
class student{
	int roll;
	double marks;
	void getdata(int roll,double marks){
		this.roll=roll;
		this.marks=marks;
	}
	void showdata() {
		System.out.println("Roll of student: "+roll);
		System.out.println("Marks of student: "+marks);
	}
}
public class Q11 {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		double[] student=new double[5];
		for(int i=0;i<5;i++) {
			student[i]= new student();
			System.out.println("Enter the roll & marks of the student");
			s.getdata(sc.nextInt(),sc.nextDouble());
		}
	}

}
