import java.util.Scanner;
public class Tailer {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Array to store the occurrences of numbers from 1 to 100
	        int[] occurrences = new int[101];

	        System.out.print("Enter the integers between 1 and 100 (end with 0): ");

	        while (true) {
	            int number = scanner.nextInt();

	            // Exit if the input is 0
	            if (number == 0) {
	                break;
	            }

	            // Increment the count for valid numbers
	            if (number >= 1 && number <= 100) {
	                occurrences[number]++;
	            }
	        }

	        // Display the results
	        for (int i = 1; i <= 100; i++) {
	            if (occurrences[i] > 0) {
	                System.out.println(i + " occurs " + occurrences[i] + " " + (occurrences[i] > 1 ? "times" : "time"));
	            }
	        }

	        scanner.close();
	    }
	}


