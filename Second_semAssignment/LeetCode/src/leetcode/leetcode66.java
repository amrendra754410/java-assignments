package class_problem;

import java.util.Arrays;

public class leetcode66 {
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int digits[] = {9};
		 System.out.println(Arrays.toString(plusOne(digits)));
	}
	 public static int[] plusOne(int[] digits) {
		 int[] result = digits;
		 for(int i=result.length-1; i>=0; i--) {
			 if(result[i] == 9) {
				 result[i] = 0;
			 } else {
				 result[i]+=1;
				 return result;
			 }
			
		 }
        result = new int[result.length + 1];
		result[0] = 1;
        return result;
	 }
	 
}
