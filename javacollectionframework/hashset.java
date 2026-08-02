package javacollectionframework;

import java.util.HashSet;
import java.util.Set;

public class hashset {
    public static void main(){
        Set<Integer>st = new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(1);
        st.add(3);
        System.out.println(st);
    }

}
