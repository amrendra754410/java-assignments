package Class_problem;

public class Q9 {
	public static int rev(int num) {
		if(num==0)
			return 0;
		return num % 10 * (int) Math.pow(10, Integer.toString(num).length() -1) + rev(num/10);
	}
	public static void main(String[] args) {
		System.out.println(rev(523));
	}
}