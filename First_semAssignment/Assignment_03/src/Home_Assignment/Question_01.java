package Home_Assignment;
import java.util.*;
public class Question_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int random = (int)(Math.random()*2);
		System.out.print("scissor (0), rock (1), paper (2) : ");
		int user = sc.nextInt();
		String str = null;
		if(random==user) 
			str="It is a draw";
		else if(random==0 && user==1 || random==1 && user==2 || random==2 && user==0) 
			str="You Won";
		else
			str="You loss";
		System.out.println("The computer is "+random+"."+" You are "+user+". "+str);
	}

}





