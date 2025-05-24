package Class_Work;
import java.util.*;
public class Question_10 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Marks: ");
		int marks = sc.nextInt();
		char grade; 
		switch(marks/10){
		case 9:
			grade='O';
			break;
		case 8:
			grade='A';
			break;
		case 7:
			grade='B';
			break;
		case 6:
			grade='C';
			break;
		case 5:
			grade='D';
			break;
		case 4:
			grade='E';
			break;
		default:
			grade='F';
		}
		System.out.println(grade);
		
	}

}
