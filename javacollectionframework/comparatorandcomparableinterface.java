package javacollectionframework;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class comparatorandcomparableinterface {
    public static void main(){
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(40);
        list.add(19);
        list.add(1);
        System.out.println(list);

        //sorting algorithm
        Collections.sort(list);
        System.out.println(list);


    }
}
