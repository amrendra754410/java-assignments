package leetcode;

import java.util.Arrays;

public class leetcode27 {
	public static int removeDuplicates(int[] nums) {
        int index = 0;
        int[] newarr = new int[nums.length];
        for (int i=0; i<nums.length; i++){
            for(int j=0; j<newarr.length; j++){
            	System.out.println(Arrays.toString(nums));
            	System.out.println(Arrays.toString(newarr));
            	System.out.println(i + " "+ j);
            	
            	if (nums[i] == newarr[j]) {
            		break;
            	} else {
            		newarr[index] = nums[i];
            		index++;
            		break;
            	}
            	
            }
        }

        nums = newarr;
        System.out.println(Arrays.toString(nums));
        return index;
    }

	public static void main(String[] args) {
		
		int[] nums = {1,1,2};
		
		int k = removeDuplicates(nums);
		System.out.println(k);
		

	}

}
