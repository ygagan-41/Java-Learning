package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class stringisvalidornot {

    static boolean solve(String str){
        Deque<Character> st = new ArrayDeque<>();

        for(char ch : str.toCharArray()){

            //agar a ya b hai to push kardo
            if(ch == 'a' || ch == 'b'){
                st.push(ch);
            }
            else{
                //agar stack me do se kam element hai toh false return kardo
                if(st.size() < 2){
                    return false;
                }

                //agar top pe b nhi hai toh false return varna pop
                if(st.peek() != 'b'){
                    return false;
                }
                st.pop();

                //agar top pe a nhi hai toh false return varna pop
                if(st.peek() != 'a'){
                    return false;
                }
                st.pop();

            }
        }
        if(st.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    } 
    public static void main(String[] args) {
        String str = new String("abcabc");
        boolean result = solve(str);
        System.out.println(result);
}
}
