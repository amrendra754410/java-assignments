package Output_Question;

public class may {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1071;
		int bit=0, sum=0,q=n;
		while (q!=0) {
			bit = q%10;
			q = q/10;
			sum+=bit;
			System.out.printf("[Debug] bit = %d, q = %d, sum = %d",bit,q,sum);
			System.out.println();
		}
		if (sum%9==0) {
			System.out.println("YES");
		}
	}

}
