
public class Random {

	public static void main(String[] args) {
		int n = 8;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = (Math.random() > .5 ? 1 : 0);
		}

		System.out.print("Array: [");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + (i == arr.length - 1 ? "]" : ", "));
		}
		System.out.println();

		int zerocount = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				zerocount++;
			}
		}

		System.out.println("Zero: " + zerocount);
		System.out.println("One: " + (n - zerocount));
	}

}
