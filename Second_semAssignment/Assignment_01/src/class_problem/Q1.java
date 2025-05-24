package class_problem;

public class Q1 {
	public static void main(String args []) {
		int num=Integer.parseInt(args[0]);
		//int num=50;
		int num1=4;
		int count=0;
		while(num1<num) {
			num1 *=2;
			count +=1;	
		}
		System.out.println(count);
	}

}
