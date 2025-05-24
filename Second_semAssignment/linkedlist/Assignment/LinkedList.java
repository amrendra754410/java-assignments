package Assignment;
import java.util.Scanner;
class chatgpt {
    protected int regd_no;
    protected float mark;
    protected Node next;

    public chatgpt(int regd_no, float mark) {
        this.regd_no = regd_no;
        this.mark = mark;
        this.next = null;
    }
}

public class LinkedList {
    static Scanner sc = new Scanner(System.in);

    public static Node create(Node start) {
        System.out.print("Enter regd_no: ");
        int regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        float mark = sc.nextFloat();

        Node newNode = new Node();
        newNode.redg_no=regd_no;
        newNode.mark=mark;
        if (start == null) {
            start = newNode;
        } else {
            Node temp = start;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
        return start;
    }

    public static void display(Node start) {
        Node temp = start;
        if (temp == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.println("Regd_no\tMark");
        while (temp != null) {
            System.out.println(temp.regd_no + "\t" + temp.mark);
            temp = temp.next;
        }
    }

    public static Node InsBeg(Node start) {
        System.out.print("Enter regd_no: ");
        int regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        float mark = sc.nextFloat();
        Node newNode = new Node(regd_no, mark);
        newNode.next = start;
        return newNode;
    }

    public static Node InsEnd(Node start) {
        return create(start);
    }

    public static Node InsAny(Node start) {
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        System.out.print("Enter regd_no: ");
        int regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        float mark = sc.nextFloat();
        Node newNode = new Node(regd_no, mark);

        if (pos == 1) {
            newNode.next = start;
            return newNode;
        }

        Node temp = start;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return start;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        return start;
    }

    public static Node DelBeg(Node start) {
        if (start == null) {
            System.out.println("List is empty");
            return null;
        }
        return start.next;
    }

    public static Node DelEnd(Node start) {
        if (start == null || start.next == null) return null;
        Node temp = start;
        while (temp.next.next != null) temp = temp.next;
        temp.next = null;
        return start;
    }

    public static Node DelAny(Node start) {
        System.out.print("Enter position: ");
        int pos = sc.nextInt();

        if (pos == 1) return DelBeg(start);

        Node temp = start;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Invalid position");
            return start;
        }

        temp.next = temp.next.next;
        return start;
    }

    public static Node DelByRegdNo(Node start) {
        System.out.print("Enter regd_no to delete: ");
        int regd_no = sc.nextInt();

        if (start == null) {
            System.out.println("List is empty");
            return null;
        }

        if (start.regd_no == regd_no) return start.next;

        Node temp = start;
        while (temp.next != null && temp.next.regd_no != regd_no) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Node not found");
        } else {
            temp.next = temp.next.next;
        }
        return start;
    }

    public static void search(Node start) {
        System.out.print("Enter regd_no to search: ");
        int regd_no = sc.nextInt();
        Node temp = start;
        while (temp != null) {
            if (temp.regd_no == regd_no) {
                System.out.println("Record found. Current mark: " + temp.mark);
                System.out.print("Enter new mark: ");
                temp.mark = sc.nextFloat();
                return;
            }
            temp = temp.next;
        }
        System.out.println("Record not found");
    }

    public static void sort(Node start) {
        for (Node i = start; i != null; i = i.next) {
            for (Node j = i.next; j != null; j = j.next) {
                if (i.mark < j.mark) {
                    float tempMark = i.mark;
                    int tempRegd = i.regd_no;

                    i.mark = j.mark;
                    i.regd_no = j.regd_no;

                    j.mark = tempMark;
                    j.regd_no = tempRegd;
                }
            }
        }
        System.out.println("List sorted by mark (descending).");
    }

    public static int count(Node start) {
        int cnt = 0;
        Node temp = start;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }

    public static Node reverse(Node start) {
        Node prev = null, curr = start, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node start = null;
        int choice;

        while (true) {
            System.out.println("\n**** MENU ****");
            System.out.println("0: Exit");
            System.out.println("1: Creation");
            System.out.println("2: Display");
            System.out.println("3: Insert at Beginning");
            System.out.println("4: Insert at End");
            System.out.println("5: Insert at Any Position");
            System.out.println("6: Delete from Beginning");
            System.out.println("7: Delete from End");
            System.out.println("8: Delete from Any Position");
            System.out.println("9: Delete by regd_no");
            System.out.println("10: Search and Update");
            System.out.println("11: Sort by Marks (Descending)");
            System.out.println("12: Count Nodes");
            System.out.println("13: Reverse List");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 0: System.exit(0);
                case 1: start = create(start); break;
                case 2: display(start); break;
                case 3: start = InsBeg(start); break;
                case 4: start = InsEnd(start); break;
                case 5: start = InsAny(start); break;
                case 6: start = DelBeg(start); break;
                case 7: start = DelEnd(start); break;
                case 8: start = DelAny(start); break;
                case 9: start = DelByRegdNo(start); break;
                case 10: search(start); break;
                case 11: sort(start); break;
                case 12: System.out.println("Total nodes: " + count(start)); break;
                case 13: start = reverse(start); break;
                default: System.out.println("Wrong choice");
            }
        }
    }
}

    

