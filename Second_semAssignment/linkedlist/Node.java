public class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        
    }
}

class linkedlist{
    Node head;
    Node tail;
    static int size;
    //insert at start
    void insertAtStart(int data){
        Node temp=new Node(data);
        size++;
        if(head==null){
            head=tail=temp;
            return;
        }
        temp.next=head;
        head=temp;
    }
    //inset at end 
    void insertAtEnd(int data){
        Node temp=new Node(data);
        size++;
        if(head==null){
            head=tail=temp;
            return;
        }
        tail.next=temp;
        tail=temp;
    }
    //insert at end only used head
    /*void insertAtEnd1(Node head,int data){
        Node temp=new Node(data);
        Node t=head;
        while(t.next!=null){
            t=t.next;
        }
        t.next=temp;
        size++;
    }*/
    // insert at index
    void insertidx(int idx,int data){
        if(idx==size){
            insertAtEnd(data);
            return;
        }
        else if(idx==0){
            insertAtStart(data);
            return;
        }
        else if(idx<0 || idx>size){
            System.out.println("Invalid index");
            return;
        }
        Node t=new Node(data);
        Node temp=head;     
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        t.next=temp.next;
        temp.next=t;
        size++;
    }
    //get the value of that index
    int getAt(int idx){
        if(idx<0 || idx>size){
            return -1;
        }
        Node temp=head;
        for(int i=1;i<=idx;i++){
            temp=temp.next;
        }
        return temp.data;
    }
    //remove 
    void remove(int index){
        if(index==0){
            head=head.next;
            size--;
            return;
        }
        Node temp=head;
        for(int i=1;i<=index-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        if(index==size-1){
            tail=temp;
        }

        size--;
    }
   //print the linked list
   void display(){
        Node temp=head;
        if(head==null){
            System.out.println("Empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
   }
//    void displayr(Node head){
//         Node temp=head;
//         if (head==null); return;
//         System.out.println(temp.data+" ");
//         displayr(temp=temp.next);
//    }


    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        // ll.display();
        // System.out.println("Size   "+ll.size);
        ll.insertAtStart(5);
        // ll.display();
        // System.out.println("Size   "+ll.size);
        ll.insertAtEnd(8);
        // ll.display();
        // System.out.println("Size   "+ll.size);
        ll.insertAtEnd(25);
        // ll.display();
        // System.out.println("Size   "+ll.size);
        ll.insertAtStart(50);
        // ll.display();
        // System.out.println("Size   "+ll.size);
        ll.insertidx(3,100);
        // ll.display();
        // System.out.println("Size   "+ll.size);
        ll.insertidx(5, 200);
        // ll.display();
        // System.out.println("Size   "+ll.size);
        ll.insertAtEnd(80);
        // System.out.println(ll.tail.data);
        // ll.display();
        // System.out.println("Size   "+ll.size);
        // ll.insertidx(0, 0);
        ll.display();
        ll.remove(0);
        ll.display();
        // System.out.println(ll.tail.data);
        System.out.println(ll.head.data);
        // ll.insertidx(100, 5);
        System.out.println("Size   "+ll.size);
        // System.out.println(ll.getAt(4));
        

    }

}