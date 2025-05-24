package Class_problem;

public class Q8 {
	public static int pow(int base,int power) {
		if(power==0)
			return 1;
		return base*pow(base,power-1);
	}
	public static void main(String[] args) {
		System.out.println();
	}

}
