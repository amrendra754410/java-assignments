
public class common1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,20,40,50,20};
		int[] dublicate=new int[arr.length];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			boolean isdublicate=false;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==dublicate[j]) {
					isdublicate=true;
				}
			}
			if(!isdublicate) {
				dublicate[index]=arr[i];
				index++;
			}
		}
		for(int i=0;i<index;i++) {
			System.out.print(dublicate[i]+" ");
		}
		

	}

}
