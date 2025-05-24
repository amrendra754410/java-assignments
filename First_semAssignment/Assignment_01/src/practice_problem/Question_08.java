package practice_problem;

public class Question_08 {
	public static void main(String[] args) {
		System.out.println("Before exchange");
		int x=5;
		int y=10;
		System.out.println("x="+x+"   y="+y);
		x=x+y; //10+5=15
		y=x-y; //15-10=5
		x=x-y; //15-5=10
		System.out.println("After exchange");
		System.out.println("x="+x+"   y="+y);
		
		
	}

}
