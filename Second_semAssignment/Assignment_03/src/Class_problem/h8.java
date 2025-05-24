package Class_problem;

public class h8 {

	    
	    public static void solveTowers(int n, char a, char b, char c) {
	        if (n == 1) {
	            System.out.println("Move disk 1 from " + a + " to " + c);
	            return;
	        }
	        solveTowers(n - 1, a, c, b);
	        System.out.println("Move disk " + n + " from " + a + " to " + c);
	        solveTowers(n - 1, b, a, c);
	    }
	    public static void main(String[] args) {
	        int n = 4;
	        System.out.println("Solving Towers of Hanoi with " + n + " disks:");
	        solveTowers(n, 'a', 'b', 'c');
	    }
	}



