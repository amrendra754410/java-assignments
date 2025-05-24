import java.util.Scanner;
public class Q1 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the marks:");
		int mark=sc.nextInt();
		char grade;
		switch(mark/10) {
		case 10,9->  grade='A';
		case 8-> grade='B';
		case 7-> grade='C';
		case 6-> grade='D';
		default  ->grade='F';
		}
		System.out.println(grade);
	}

}
