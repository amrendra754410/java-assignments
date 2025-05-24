package Command_Line;

public class Question_01{

	public static void main(String[] args){
		int dividend=Integer.parseInt(args[0]);
		int divisor=Integer.parseInt(args[1]);
		int quotient=dividend/divisor;
		int remainder=dividend%divisor;
		System.out.println("Dividend="+dividend+"\nDivisor="+divisor);
		System.out.println("Quotient="+quotient+"\nRemainder="+remainder);

	}

}