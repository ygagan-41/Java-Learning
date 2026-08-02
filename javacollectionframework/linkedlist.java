package javacollectionframework;

import java.util.LinkedList;

public class linkedlist{
    public static void main(){

        //creation of linked list 
        LinkedList<Integer> list = new LinkedList<>();

        //all functions of arraylist works in linkedlist same as arraylist function except clone

        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        System.out.println(list);

        //get

        System.out.println(list.get(2));

        //set
        list.set(0,10);
        System.out.println(list);

        //contains-returns true if element is present in list
    
        System.out.println( list.contains(3)); //false

    }
}
