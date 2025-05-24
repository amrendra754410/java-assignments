package Command_Line;

public class Question_02 {
	public static void main(String[] args){
		double num1=Integer.parseInt(args[0]);
		double num2=Integer.parseInt(args[1]);
		double pow=Math.pow(num1,num2);
		System.out.println("Power: "+pow);
		
	}

}
