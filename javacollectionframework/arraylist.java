package javacollectionframework;
import java.util.ArrayList;
import java.util.List;
public class arraylist{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(); // creation of array list

        //adding element to arraylist
        arr.add(10);
        arr.add(20);
        arr.add(40);
        System.out.println(arr);
        arr.add(30);
        System.out.println(arr);

        //remove element
        arr.remove(0);
        System.out.println(arr);

        //creation of another list
        ArrayList<Integer> arr2 = new ArrayList<>();

        //add all element of arr list in arr2 list
        arr2.add(45);
        arr2.add(556);
        arr.addAll(arr2);
        System.out.println(arr);

        //size
        System.out.println(arr.size());

        //clear all element
        arr.clear();
        System.out.println(arr.size());

        //getandset get used to fetch eleement and set used to set element at particular index
        List<Integer> list = new ArrayList<>();
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
  