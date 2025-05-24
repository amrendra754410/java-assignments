package Class_Work;
import java.util.*;
public class Question_07 {
	public static int convt_octal(int num) {
		int output=0;
		int index=0;
		int[] arr=new int[128];
		while(num!=0) {
			int rem=num%8;
			num=num/8;
			arr[index] = rem;
			index++;
		}
		for (int i=index-1; i>=0; i--) {
			output = output*10+arr[i];
		}
		return output;
	}
	public static void main(String args []) {
		System.out.println(convt_octal(779));
		//convt_octal(779);
	}
	
}
