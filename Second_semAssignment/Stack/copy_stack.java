import java.util.Stack;
import java.util.Scanner;

public class copy_stack {
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        Stack<Integer> st=new Stack<>();
        /*System.out.print("Enter the number of element:  ");
        int n=sc.nextInt();
        System.out.print("Enter the element: ");
        for(int i=1;i<=n;i++){
            int element=sc.nextInt();
            st.push(element);
        }
        System.out.println(st); */
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack<Integer> rt=new Stack<>();
        Stack<Integer> copy=new Stack<>();
        while(st.size()!=0){
            rt.push(st.pop());
            
        }
        System.out.println(rt);
        
        while(rt.size()!=0){
            copy.push(rt.pop());
            
        }
        System.out.println(copy);
        

    }

    
}
