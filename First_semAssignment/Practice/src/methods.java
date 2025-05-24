import java.util.*;
public class methods {
	public static int gcd(int x, int y) {
		while(x%y!=0) {
			 int temp=x;
	         x=y;
	         y=temp%y;	
			}
		return y;
	}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int result = gcd(33, 66);
		System.out.println(result);
		scanner.close();
	}
}
