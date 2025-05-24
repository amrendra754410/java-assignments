import java.util.Scanner;

public class validnotvalid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total no. of classes: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.print("Enter present/absent status: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		boolean allowed = true;
		for (int i = 0; i < arr.length; i++) {
			if (i + 4 < arr.length) {
				System.out.println(i);
				if (arr[i] == 0 && arr[i + 1] == 0 && arr[i + 2] == 0 && arr[i + 3] == 0 && arr[i + 4] == 0) {
					allowed = false;
					System.out.println("True: "+i);
					break;
				}
			}
		}
		if (allowed) {
			System.out.println("Allowed.");
		} else {
			System.out.println("Not allowed.");
		}
	}

}
