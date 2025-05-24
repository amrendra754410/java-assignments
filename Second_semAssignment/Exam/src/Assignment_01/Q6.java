package Assignment_01;

public class Q6 {
	public static boolean isOdd(int n) {
		return (n & 1) !=0;
	}
	
	public static void main(String[] args) {
		System.out.println(isOdd(38));
	}

}
