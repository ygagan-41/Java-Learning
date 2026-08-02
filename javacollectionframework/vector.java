package javacollectionframework;

import java.util.Vector;

public class vector {
    static void main(){
    
        //creation of vector
        Vector<Integer> list = new Vector<>();
        //Vector<String> vector = new Vector<>();

        //all elements same as add,size,clear etc same as arraylist

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
