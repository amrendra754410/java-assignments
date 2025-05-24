package Command_Line;

public class Question_03 {
	public static void main(String[] args) {
		int num1 = (int)(Math.random()*6)+1;
		int num2 = (int)(Math.random()*6)+1;
		int sum = num1+num2;
		System.out.println("Sum of two number: "+sum);
		int count = 0;
		for (int i =0; i<10; i++){
			count++;
		}
		System.out.println(count);
	}
}
