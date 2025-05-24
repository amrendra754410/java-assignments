package class_problem;

public class leetcode35 {
	 public int searchInsert(int[] nums, int target) {
		 int result = 0;
		 for (int i=0; i<nums.length; i++) {
			 if (nums[i] == target) return i;
			 if (target < nums[i]) return i-1;
		 }
		 return nums.length + 1;
	 }
}
