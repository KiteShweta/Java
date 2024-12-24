package collections.stack;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<>();

        st.push(2);
        st.push(5);
        st.push(8);

        System.out.println(st);

        Integer i = st.pop();

        System.out.println(i);
        System.out.println(st);

        Integer j = st.peek();
        System.out.println(j);

        //search
        Integer s = st.search(5);
        System.out.println(s);

        System.out.println(st.empty());

    }
    
}
