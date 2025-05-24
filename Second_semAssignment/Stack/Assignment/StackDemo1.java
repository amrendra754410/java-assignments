package Assignment;
import java.util.Scanner;

public class StackDemo1 {

    public static final int MAX = 10;

    public static int push(int[] S, int top) {
        // Method body to be implemented
        return top;
    }

    public static int pop(int[] S, int top) {
        // Method body to be implemented
        return top;
    }

    public static void display(int[] S, int top) {
        // Method body to be implemented
    }

    public static boolean isEmpty(int top) {
        // Method body to be implemented
        return false;
    }

    public static boolean isFull(int top) {
        // Method body to be implemented
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] stack = new int[MAX];
        int top = -1;

        while (true) {
            System.out.println("***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    top = push(stack, top);
                    break;
                case 2:
                    top = pop(stack, top);
                    break;
                case 3:
                    display(stack, top);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
