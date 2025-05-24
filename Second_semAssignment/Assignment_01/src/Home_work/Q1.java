package Home_work;
import java.util.*;
public class Q1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a + b == c) {
			System.out.println("a + b = c"+" This exprestion is True");
		}
		else {
			System.out.println("a + b = c"+" This exprestion is False");
			
		}
		if(a == b-c) {
			System.out.println("a = b − c"+" This exprestion is True");
		}
		else {
			System.out.println("a = b − c"+" This exprestion is False");
		}
		if(a*b==c) {
			System.out.println("a b = c"+" This exprestion if True");
		}
		else {
			System.out.println("a b = c"+" This exprestion if False");
			
		}
		
		




		sc.close();
	}

}
