import java.util.Scanner;
public class GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
//		while (a%b != 0) {
//			int temp = (a%b);
//			a = b;
//			b = temp;
//			System.out.println(b);
//		}
//		
//		System.out.println("GCD: "+b);
		
		int gcd=0;
		for(int i =a;i<=b;i++) {
			if(a==i && b==i) {
				gcd=i;
			}
		}

	}

}
