package youtube;




class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
    
}
public class linkedlistedImplimantion {
    Node start=null;

    void push(int d){
        Node temp=new Node(d);
        temp.next=start;
        start=temp;
    }
    int pop(){
        if(start==null){
            System.out.print("Stack is empty");
            return -1;
        }
        int x=start.data;
        start=start.next;
        return x;
    }
    int peek(){
        if(start==null){
            System.out.println("Stack is empty");
            return -1;
        }
        return start.data;
    }
    void displayrec(Node h){
        if(h==null) return;
        displayrec(h.next);
        System.out.print(h.data+" ");
    }
    void display(){
        displayrec(start);
        System.out.println();

    }
    void prinrt_rev(){
        // Node current=start;
        // Node prev=null;
        // Node agla;
        // while(current!=null){
        //     agla=current.next;
        //     current.next=prev;
        //     prev=current;
        //     current=agla;
        // }
        // start=current;
        Node temp=start;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        linkedlistedImplimantion st=new linkedlistedImplimantion();
        st.push(0);
        st.push(1);
        st.push(2);
        st.push(3);
        st.display(); // 0 1 2 3
        st.pop();
        st.display(); //0 1 2
        System.out.println(st.peek());
        
    }
    
}
