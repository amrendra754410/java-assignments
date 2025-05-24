package Assignment_01;

public class Q5 {
	public static int sum_of_digit(int n) {
		while(n>10) {
			int sum=0;
			while(n>0){
				int digit=n%10;
				sum +=digit;
				n=n/10;
			}
			n=sum;
		}
		return n;
	}
	
	public static void main(String[] args) {
		System.out.println(sum_of_digit(9294));
	}

}
