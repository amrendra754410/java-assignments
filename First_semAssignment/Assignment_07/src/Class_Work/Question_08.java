package Class_Work;

import java.util.*;

public class Question_08 {
	public static int[] create_array(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = (int) (Math.random() * 50);
		}
		return arr;
	}

	public static void display_array(int[] arr) {
		System.out.print("Current Array: [");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + (i == arr.length - 1 ? "]" : ", "));
		}
		System.out.println();
	}

	public static int[] insert_element(int[] arr, int index, int element) {
		int[] newarray = new int[arr.length + 1];
		for (int i = 0; i < newarray.length; i++) {
			if (i == index) {
				newarray[i] = element;
			} else if (i < index) {
				newarray[i] = arr[i];
			} else if (i > index) {
				newarray[i] = arr[i - 1];
			}
		}
		return newarray;
	}

	public static int[] delete_array(int[] arr, int index) {
		int[] newarray = new int[arr.length - 1];
		for (int i = 0; i < newarray.length; i++) {
			if (i < index) {
				newarray[i] = arr[i];
			} else {
				newarray[i] = arr[i + 1];
			}
		}
		return newarray;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		boolean running = true;
		int[] arr = null;
		while (running) {
			System.out.println("press 1 for Create an array of N integers");
			System.out.println("press 2 for Display the array elements");
			System.out.println("press 3 for Insert an element at specific position");
			System.out.println("press 4 for Delete an element at a given position");
			System.out.println("press 5 for Exit");
			System.out.print("Your Choice: ");
			int input = sc.nextInt();
			if (input == 5) {
				running = false;
			} else if (input == 1) {
				System.out.print("Enter the size of array: ");
				int n = sc.nextInt();
				arr = create_array(n);
				System.out.println("Array Created!");
			} else if (input == 2) {
				if (arr == null) {
					System.out.println("No array");
				} else {
					display_array(arr);
				}
			} else if (input == 3) {
				if (arr == null) {
					System.out.println("No array");
				} else {
					System.out.print("Enter the index (0-" + arr.length + "): ");
					int index = sc.nextInt();
					System.out.print("Enter the element: ");
					int element = sc.nextInt();
					arr = insert_element(arr, index, element);
					System.out.println("Element Inserted!");
				}
			} else if (input == 4) {
				if (arr == null) {
					System.out.println("No array");
				} else {
					System.out.print("Enter the index (0-" + (arr.length - 1) + "): ");
					int index = sc.nextInt();
					arr = delete_array(arr, index);
				}
			}
		}
	}
}