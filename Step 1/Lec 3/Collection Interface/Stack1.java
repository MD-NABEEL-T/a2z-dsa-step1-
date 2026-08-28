import java.util.*;
public class Stack1 {
    // LIFO
    public static void main(String []args){
        Stack<Integer> st=new Stack<>();
        st.push(23);
        st.push(2234);
        st.push(232);
        st.push(34);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
        // peek() is used to print the last element ok.\
        System.out.println(st.empty());
    }
}
