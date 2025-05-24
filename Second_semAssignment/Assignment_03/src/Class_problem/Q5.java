package Class_problem;
import java.util.*;
public class Q5 {
	public static < E > void printArray( E[] inputArray) {
		for(int i=0;i<inputArray.length;i++) {
			System.out.print(inputArray[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		Double [] array= {1.5,2.5,3.0};
		printArray(array);
		
	}

}
