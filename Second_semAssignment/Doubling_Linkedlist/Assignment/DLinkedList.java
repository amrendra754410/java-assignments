package Assignment;

import java.util.*;

class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;
    protected Node prev;
}

public class DLinkedList {
    static Scanner sc=new Scanner(System.in);
    Node start=null;
    Node end=null;

    // Method to create the list
    public static Node create(Node start, Node end) {
        System.out.print("Enter the number student: ");
        int n=sc.nextInt();
        if(n<=0){
            System.out.print("Input can't be less than 1!");
            return start;
        }
        System.out.print("Enter the 1 student detail: ");
        start.regd_no=sc.nextInt();
        start.mark=sc.nextFloat();
        start.prev=null;
        start.next=null;
        Node current=start;
        for(int i=2;i<=n;i++){
           Node newly=new Node();
           System.out.println("Enter student "+i+" details (Redg No and Marks):");
            newly.regd_no=sc.nextInt();
            newly.mark=sc.nextFloat();
            start.next=newly;
            newly.next=start;
            current=newly;
        }

        return start;
    }

    // Method to display the list
    public static void display(Node start, Node end) {
        if(start==null){
            System.out.println("Empty linked list");
            System.out.println();
            return;
        }
        Node temp=start;
        System.out.println("Reg.no:      Mark");
        while (temp!=null) {
            System.out.println(temp.regd_no+"      "+temp.mark);
            temp=temp.next;
        }
    }

    public static Node insBeg(Node start, Node end) {
        // Insert at beginning
        return null;
    }

    public static Node insEnd(Node start, Node end) {
        // Insert at end
        return null;
    }

    public static Node insAny(Node start, Node end) {
        // Insert at any position
        return null;
    }

    public static Node delBeg(Node start, Node end) {
        // Delete from beginning
        return null;
    }

    public static Node delEnd(Node start, Node end) {
        // Delete from end
        return null;
    }

    public static Node delAny(Node start, Node end) {
        // Delete from any position
        return null;
    }

    public static void search(Node start) {
        // Search and update mark
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node start = null, end = null;

        while (true) {
            System.out.println("**** MENU ****");
            System.out.println("0: Exit");
            System.out.println("1: Create List");
            System.out.println("2: Display List");
            System.out.println("3: Insert at Beginning");
            System.out.println("4: Insert at End");
            System.out.println("5: Insert at Any Position");
            System.out.println("6: Delete from Beginning");
            System.out.println("7: Delete from End");
            System.out.println("8: Delete from Any Position");
            System.out.println("9: Search and Update");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    end = create(start, end);
                    break;
                case 2:
                    display(start, end);
                    break;
                case 3:
                    start = insBeg(start, end);
                    break;
                case 4:
                    end = insEnd(start, end);
                    break;
                case 5:
                    start = insAny(start, end);
                    break;
                case 6:
                    start = delBeg(start, end);
                    break;
                case 7:
                    end = delEnd(start, end);
                    break;
                case 8:
                    start = delAny(start, end);
                    break;
                case 9:
                    search(start);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
