package Command_Line;

public class Question_05 {   
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		int max=Math.max(num3, Math.max(num1,num2));
		int min=Math.min(num3,Math.min(num1, num2));
		int sum=num1+num2+num3;
		int mid=sum-(max+min);
		System.out.println("The Ascending oder: "+min+","+mid+","+max);
	}

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      