package Practice_problem;

public class Question_02 {
	public static int getpentagonalNumber(int num) {
		int number=(num*(3*num-1))/2;
		return number;
	}
	public static void main(String args []) {
		for(int i=1;i<=100;i++) {
			if (i%10==0) {
				System.out.println(getpentagonalNumber(i)+",");
			} else {
				System.out.print(getpentagonalNumber(i)+",");
			}
		}
	}

}
