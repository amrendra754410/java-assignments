package Command_Line;

public class Question_04 {
	public static void main(String[] args) {
		double value = Integer.parseInt(args[0]);
		double value1 = Math.cos(5*value);
		double value2 = Math.sin(7*value);
		double value3 = value1+value2;
		System.out.print(value3);
	}
 
}
