package Command_Line;

public class Question_07 {
	public static void main(String[] args){
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		
		boolean a = num1>=(num2*num3)||num2>=(num1*num3)||num3>=num1*num2;
		System.out.println(a);
//		
//		int a=Integer.MAX_VALUE;
//		System.out.println(a+9);
//		System.out.println(-a-8);
//		System.out.println(a*3);
//		System.out.println(a>>24); 
		
	}

}   
