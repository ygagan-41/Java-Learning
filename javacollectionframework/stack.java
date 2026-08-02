package javacollectionframework;

import java.util.Stack;

public class stack {
    static void main(){

        //creation of stack follows lifo

        Stack<Integer> stack = new Stack<>();

        //stack uses push,pop,peek,search and empty.

        stack.push(2);
        System.out.println(stack);
        stack.push(3);
        System.out.println(stack);
        stack.push(4);
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        stack.peek();
        System.out.println(stack);

    }
}
