
public class common2 {
	public static void main(String args[]) {
		int[] arr= {10,20,30,40,50};
		int[] arr1= {10,20,40,90,30};
		int[] com=new int[arr.length];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				if(arr[i]==arr1[j]) {
					boolean comman=false;
					System.out.println(arr[i]+" "+arr[j]);
					for(int k=0;k<com.length;k++) {
						if(arr[i]==com[k]) {
							comman=true;
							break;
						}
					}
					if(!comman) {
						com[index]=arr[i];
						index++;
						
					}
				}
			}
		}
		for(int i=0;i<index;i++) {
			System.out.println(com[i]);
		}
	}

}
