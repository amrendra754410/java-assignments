package Class_problem;
import java.util.*;
public class Q6 {
	
	public static <T> int count(T[] array, T item) {
		int count=0;
		for(int i=0;i<array.length;i++) {
			if(array[0].equals(item));
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double [] array= {1.5,2.5,3.0};
		System.out.println(count(array,2.5));
		Q5.printArray(array);

	}

}
