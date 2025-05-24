package Command_Line_H.W;

public class Question_03 {
	public static void main(String args []) {
		int num=Integer.parseInt(args[0]); //1234
		int once=num%10;  //4
		int a=num/10;     //123
		int ten=a%10;     //3
		int b=a/10;       //12
		int hun=b%10;     //2
		int c=b/10;       //1
		int sum=once+c;
		System.out.println(sum);
	}

}
