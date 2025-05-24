package class_problem;

public class leetcode1295 {
	public int findNumbers(int[] nums) {
       int count=0;
       for(int i=0; i<nums.length;i++) {
    	   int size=0;
    	   int n=nums[i];
    	   while(n!=0) {
    		   n/=10;
    		   size++;
    	   }
    	   if(size%2==0) {
    		   count++;
    	   }
       }
       return count;
	}
	public static void main(String[] args) {
		int[]nums = {12,345,2,6,7896};
		findNumbers()
	}
}
