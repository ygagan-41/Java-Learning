package stack;

import java.util.Deque;
import java.util.ArrayDeque;

public class basics {
    public static void main(String[] args) {
        
        Deque <Integer> st = new ArrayDeque<>();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st);
        System.out.println(st.size());

        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.size());

        System.out.println(st.isEmpty());
    }
}
