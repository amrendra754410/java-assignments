package Class_problem;

public class Q7 {
	public static int fab(int num) {
		if(num==0) {
			return 1;
		}
		return num*fab(num-1);
	}
	public static void main(String[] args) {
		int n=5;
		System.out.println();
	}
}
