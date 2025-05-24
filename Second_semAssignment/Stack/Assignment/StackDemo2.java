package Assignment;

import java.util.Scanner;

class Node {
    int info;
    Node next;
}

public class StackDemo2 {
    static Scanner sc =new Scanner(System.in);
    Node top=null;

    // Method body to be implemented
    public static Node push(Node top) {
        Node newNode=new Node();
        System.out.print("Enetr the information:  ");
        newNode.info=sc.nextInt();
        newNode.next=top;
        top=newNode;
        return top;
    }

    // Method body to be implemented
    public static Node pop(Node top) {
        if(top==null){
            System.out.println("Stack is empty!");
            return top;
        }
        top=top.next;
        return top;
    }
    // Method body to be implemented
    
    
    public static void display(Node top) {
        Node temp=top;
        // if(temp==null){
        //     System.out.println("Stack is empty!");
        // }
        // while(temp!=null){
        //     System.out.print(temp.info+" ");
        //     temp=temp.next;
        // }
        //System.out.println();

        if(temp==null) return;
        display(temp.next);
        System.out.print(temp.info+" ");
        

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node top = null;

        while (true) {
            System.out.println();
            System.out.println("****MENU****");
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
                    top = push(top);
                    break;
                case 2:
                    top = pop(top);
                    break;
                case 3:
                    display(top);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}

