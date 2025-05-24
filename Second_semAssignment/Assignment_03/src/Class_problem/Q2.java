package Class_problem;

public class Q2 {
	public static void main(String[] args) {
		String[] arr= {"Green","Yellow","While","Black"};
		try {
			System.out.println(arr[10]);
			arr=null;
			arr[0]="Pink";
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("There are no element of the array");
		}catch(NullPointerException e) {
			System.out.println("No array");
		}
	}
}
