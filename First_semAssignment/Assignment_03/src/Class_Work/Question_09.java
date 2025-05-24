package Class_Work;
import java.util.*;
public class Question_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three integer: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int slargest=0;
		if(num1>num2 & num1>num3) {
			System.out.println(num1);
			slargest = num2>num3 ? num2:num3;
			System.out.println(slargest);
		} else if(num2>num3 & num2>num1) {
			System.out.println(num2);
			slargest = num3>num1 ? num3:num1;
			System.out.println(slargest);
		} else {
			System.out.println(num3);
			slargest = num2>num1 ? num2:num1;
			System.out.println(slargest);
		}

	}

}
