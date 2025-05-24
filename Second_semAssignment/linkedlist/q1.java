class Node{
    String data;
    Node next;
    Node(String data){
        this.data=data
        this.next=null;
    }
}

class q1{
    Node head;
    void insAtBeginning(String d){
        Node newNode=new Node(d);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;   //link
        head=newNode;
    }
    void insAtLast(String d){
        Node newNode=new Node(d){
            if(head==null){
                head=newNode;
                return;
            }
            Node current=head;
            while(current.next !=null){
                current=current.next;
            }
            current.next=newNode;
        }
    }
    void print(){
        if(head=null){
            System.out.println("Empty");
            return;
        }
        Node temp=head;
        while(temp !=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node n1=new Node();
        n1.insAtBeginning("Ayush")
        
    }

}