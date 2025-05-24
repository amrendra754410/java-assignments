package class_problem;

public class Leetcode1672 {
	public int maximumWealth(int[][] accounts) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<accounts.length;i++) {
			int sum=0;
			for(int j=0;j<accounts[0].length;j++) {
				sum += accounts[i][j];
			}
			if (max > sum) {
				max  = sum;
			}
		}
		return max;
	
	}

	public static void main(String[] args) {
		int a[][] = {{1,2,3},{3,2,1}};
		System.out.println(maximumWealth(a));
	}

}
