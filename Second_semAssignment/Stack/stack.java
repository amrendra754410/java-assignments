import java.util.Stack;

class stack{
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(3);
        st.push(2);
        st.push(1);
        System.out.println(st.peek());
        System.out.println(st);
    }
    
}