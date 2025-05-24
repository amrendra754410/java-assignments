package Class_Work;
import java.util.*;
public class Question_08 {
	public static void main(String args []) {
		Scanner sc= new Scanner(System.in);
		String str=null;
		int comp=0;
		int num=0;
		do {
			comp=(int)(Math.random()*10)+1;
			System.out.println("Enter the number: ");
			num=sc.nextInt();
			if(num>comp)
				str="Too low";
			else if(num<comp)
				str="Too high";
			else
				str="good guss";
			System.out.println("Computer guess: "+comp);
			System.out.println("User guess: "+num);
			System.out.println(str+", "+"try again");
			}while(comp!=num);
		
	}

}
