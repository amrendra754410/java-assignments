package Assignment;
import java.util.*;
public class Node {
    public static final String regd_no = null;
    protected int redg_no;
    protected float marks;
    protected Node next;
}
class linkedlist{
    static Scanner sc=new Scanner(System.in);
    static Node start=null;
    static Node last=null;
    
    public static void create(Node start){
        System.out.print("Enter the number of student: ");
        int n=sc.nextInt();
        if(n<=0){
            System.out.print("Input can't be less than 1!");
            return;
        }
        System.out.println("Enter student 1 details (Redg No and Marks):");
        start.redg_no=sc.nextInt();
        start.marks=sc.nextFloat();
        start.next=null;

        Node temp=start;
        for(int i=2;i<=n;i++){
            Node newly=new Node();
            System.out.println("Enter student "+i+" details (Redg No and Marks):");
            newly.redg_no=sc.nextInt();
            newly.marks=sc.nextFloat();
            newly.next=null;
            temp.next=newly;
            temp=newly;
        }
    }
     //At the beginning of the list
    public static Node InsBeg(Node start){
        System.out.print("Enter reg no.: ");
        int reg=sc.nextInt();
        System.out.print("Enter the marks: ");
        float marks=sc.nextFloat();
        Node temp=new Node();
        temp.redg_no=reg;
        temp.marks=marks;
        if(start==null){
           start=temp;
           return start;
        }
        temp.next=start;
        start=temp;
        return start;    
    }
    //At the end of the list
    public static Node InsEnd(Node start){
        if(start==null){
            start = InsBeg(start);
            return start;
        }
        Node temp=new Node();
        System.out.print("Enter reg no.: ");
        temp.redg_no=sc.nextInt();
        System.out.print("Enter the marks: ");
        temp.marks=sc.nextFloat();
        Node pointer=start;
        while(pointer.next!=null){
            pointer=pointer.next;
        }
        pointer.next=temp;
        return start;
    }

    // At any position in the list
    public static Node InsAny(Node start){
        int ind = sc.nextInt();
        Node temp=new Node();
        System.out.print("Enter reg no.: ");
        temp.redg_no=sc.nextInt();
        System.out.print("Enter the marks: ");
        temp.marks=sc.nextFloat();
        Node pointer=start;
        for(int i=1;i<ind-1;i++){
            pointer=pointer.next;
        }
        temp.next=pointer.next;
        pointer.next=temp;
        return start;     
    }
    //From the beginning of the list
    public static Node DelBeg(Node start){
        if(start==null){
            System.out.println("Empty list");
            return start;
        }
        start=start.next;
        return start;
     }
    //From the end of the list
    public static Node DelEnd(Node start){
        if(start==null){
            System.out.println("Empty list");
            return start;
        }
        if (start.next == null){
            start = null;
            return start;
        }
        Node current=start;
        Node prev=null;
        while(current.next!=null){
            prev=current;
            current=current.next;
        }
        prev.next=null;
        return start;
     }
     //From any position in the list
    public static Node DelAny(Node start){
        System.out.print("Enter position:");
        int pos = sc.nextInt();
        if (pos>count(start)){
                System.out.println("IndexOutOfBounds");
                return start;
            }
        if (pos == 1){
            start = DelBeg(start);
            return start;
        }
        if (pos == count(start)){
            start = DelEnd(start);
            return start;
        }
        Node current = start;
        for (int i=1; i<pos; i++){
            current = current.next;
        }
        current.next = current.next.next;
        return start;
    }
    //From regstation number delet 
    public static Node reg_del( Node start){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the regstation number: ");
        int reg_del=sc.nextInt();
        Node current=start;
        Node previous = null;
        boolean found = false;


        while (current!=null) {
            if (current.redg_no == reg_del){
                found = true;
                if (previous == null){
                    start = start.next;
                    return start;
                } else{
                    previous.next = current.next;
                    return start;
                }
            }
            previous = current;
            current = current.next;
        }
        if (!found){
            System.out.println("Not found");
        }
        return start;
        
    }
    //c)Search a node based on student regd_no and update the mark of the student. If the specified node is not present in the list an error message should be displayed
    public static void search(Node start){
        System.out.print("Enter the registation number: ");
        int temp_redg=sc.nextInt();
        Node temp=start;
        boolean found=false;
        while (temp!=null) {
            if(temp.redg_no==temp_redg){
                found=true;
                System.out.print("Enter marks: ");
                temp.marks=sc.nextInt();
                return;
            }
            temp=temp.next;
            
        }
        if(!found){
            System.out.println("given reg not exist");
        }
    }
    //e)Count the number of nodes present in the linked list
    public static int count(Node start){
        Node temp=start;
        int count=0;
        while (temp!=null) {
            count++;
            temp=temp.next;
        }
        return count;
    }
    //f)Reverse the linked list
    public static Node reverse(Node start){
        Node prev = null;
        Node current = start;
        Node agla;

        while (current != null) {
            agla = current.next;
            current.next = prev; 
            prev = current;        
            current = agla;        
        }
        return current; 
    }
    // print 
    public static void display(Node start){
        Node temp=start;
        if(temp == null){
            System.out.println("Empty linked list");
            return;
           }
        System.out.println("reg no \t marks");
        while (temp!=null) {
           System.out.println(temp.redg_no+"\t"+temp.marks);
           
           temp=temp.next;
               
       }
       System.out.println();
    }   
    
    // search
    public static void sort(Node start){
        for(Node current=start;current!=null;current=current.next){
            for(Node current1=start;current1!=null;current1=current.next){
                if(current1.marks>current1.next.marks){
                    float n=current1.marks;
                    current1.marks=current1.next.marks;
                    current1.next.marks=n;
                }
            
            }
        
        }
    }
       



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Node a=null;
       

        
        while(true){
            System.out.println("\n**** MENU ****");
            System.out.println("0: Exit");
            System.out.println("1: Create");
            System.out.println("2: Display");
            System.out.println("3: Insert at Beginning");
            System.out.println("4: Insert at End");
            System.out.println("5: Insert at AnyPosition");
            System.out.println("6: Delete from Beginning");
            System.out.println("7: Delete from End");
            System.out.println("8: Delete from Any Position");
            System.out.println("9: Delete by regd_no");
            System.out.println("10: Search and Update");
            System.out.println("11: Sort by Marks (Descending)");
            System.out.println("12: Count Nodes");
            System.out.println("13: Reverse List");
            int choice=sc.nextInt();


            switch (choice) {
                case 0: System.exit(0);
                case 1: a=new Node();
                        create(a);
                break;
                case 2: display(a); 
                break;
                case 3: a = InsBeg(a); 
                break;
                case 4: a = InsEnd(a); 
                break;
                case 5: a = InsAny(a);
                break;
                case 6: a=DelBeg(a);
                break;
                case 7: a=DelEnd(a);
                break;
                case 8: a=DelAny(a);
                break; 
                case 9: a=reg_del(a);
                break;
                case 10: search(a);
                break;
                case 11: sort(a);
                break;
                case 12: System.out.println("Total Node: "+count(a));
                break;
                case 13: a=reverse(a);    //not working
                break;

            }
        }

        
        
    }

}
















 /*Node b=new Node();
        Node c=new Node();
        Node d=new Node();
        Node e=new Node();
        Node f=new Node();
        b.redg_no=10;
        b.marks=1;
        b.next=c;
        c.redg_no=20;
        c.marks=2;
        c.next=d;
        d.redg_no=30;
        d.marks=3;
        d.next=e;
        e.redg_no=40;
        e.marks=4;
        e.next=f;
        f.redg_no=50;
        f.marks=5;
        f.next=null;
        display(b);
        // reverse(b);
        // display(reverse(b));
        // search(b);
        // display(b);
        // System.out.println("Total node :"+count(b));*/







        /*a=InsBeg(a);
        // a=InsBeg(a);
        display(a);
        a=InsEnd(a);
        a=InsEnd(a);
        a=InsEnd(a);
        display(a);
        a=InsAny(a, 2);
        a=InsAny(a, 3);
        display(a);
        a=DelBeg(a);
        display(a);
        a=DelEnd(a);
        display(a);
        a=DelAny(a, 3);
        display(a);*/
