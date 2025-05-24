
public class Q1111111 {
	public static void main(String[] args) {
		int[] arr= {10,20,20,40,50,20, 10, 10, 10, 10, 10, 60, 50};
		int[] noduplicate = new int[arr.length];
		int index = 0;
		for(int i=0;i<arr.length;i++) {
			boolean isduplicate = false;
			for (int j=0; j<arr.length; j++) {
				// System.out.println(arr[i]+" "+arr[j]);
				if (arr[i]==noduplicate[j]) {
					isduplicate = true;
				}
			}
			if (!isduplicate) {
				noduplicate[index]= arr[i];
				index++;
			}
		}
		for (int i=0;i<index;i++) {
			System.out.print(noduplicate[i]+" ");
		}
		//System.out.println("Finished.");
	}

}
