
public class evenswapping {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60};
		for (int i=0;i<arr.length;i++) {
			if (i%2==0) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		System.out.print("Array :[");
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+(i!=arr.length-1?", ":"]"));
		}

	}

}
