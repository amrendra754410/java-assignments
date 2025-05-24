
public class common {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 20, 40, 50, 20, 10, 10, 10, 10, 10, 60, 50 };
		int[] arr2 = { 10, 60 };
		int[] common = new int[(arr.length > arr2.length ? arr2.length : arr.length)];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr[i] == arr2[j]) {
					boolean isincommon = false;
					for (int k = 0; k < common.length; k++) {
						if (arr[i] == common[k]) {
							isincommon = true;
							break;
						}
					}
					if (!isincommon) {
						common[index] = arr[i];
						index++;
					}
				}
			}
		}
		System.out.print("Array :[");
		for (int i = 0; i < index; i++) {
			System.out.print(common[i] + (i != index - 1 ? ", " : "]"));
		}
	}

}