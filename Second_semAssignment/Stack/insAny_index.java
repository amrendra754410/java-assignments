import java.util.*;


public class insAny_index {
    
    public static void print(Stack<Integer> s){
        System.out.println(s);
        int [] arr=new int[s.size()];
        for(int i=arr.length-1;i>=0;i--){
            arr[i]=s.pop();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            s.push(arr[i]);
        }
        System.out.println();
        System.out.println(s);
        
    }
    public static void RecInverse_print(Stack<Integer> s){
        if(s.isEmpty()) return;
        int element=s.pop();
        System.out.print(element+" ");
        RecInverse_print(s);
        s.push(element);
    }
    public static void Rec_print(Stack<Integer> s){
        if(s.isEmpty()) return;
        int element=s.pop();
        Rec_print(s);
        System.out.print(element+" ");
        s.push(element);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        // Stack<Integer> rt=new Stack<>();
        // System.out.print("Entet the index & Element whose insert: ");
        // int ind=sc.nextInt();
        // int element=sc.nextInt();

        // while(st.size()>ind){
        //     rt.push(st.pop());
        // }
        // st.push(element);
        // while (rt.size()>0) {
        //     st.push(rt.pop());
        // }
        // System.out.println(st);

        // print(st);

        RecInverse_print(st);
        System.out.println(st);
        Rec_print(st);
        System.out.println(st);


    }
    
}
