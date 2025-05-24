package youtube;

public class arrayImplimantion {
    private int [] arr=new int[5];
    private int idx=0;
    void push(int x){
        if(isFull()){
            System.out.println("Stack is full !");
            return; 
        }
        arr[idx]=x;
        idx++;
    }
    int peek(){
        if(idx==0){
            return -1;
        }
        return arr[idx-1];
    }
    int pop(){
        if(idx==0){
            System.out.println("Already empty!");
            return -1;
        }
        int i=arr[idx-1];
        arr[idx-1]=0;
        idx--;
        return i;

    }
    void display(){
        if(idx==0){
            System.out.println("Stack is empty!");
            return;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    int size(){
        return idx;
    }
    boolean isEmpty(){
        if(idx==0){
            return true;
        }else{
            return false;
        } 
    }
    boolean isFull(){
        if(idx==arr.length){
            return true;
        }else{
            return false;
        }
    }
class imp{
    public static void main(String[] args) {
        arrayImplimantion st=new arrayImplimantion();
        st.push(1);
        st.push(2);
        st.push(3);
        // st.display();
        // st.pop();
        // st.display();
        st.push(10);
        st.push(50);
        st.display();
        System.out.println(st.isFull());
        System.out.println(st.size());
        st.push(80);
        
    }
    
}
}
