package javacollectionframework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapinterface {

    static void main(){
    //map implementation using hashmap
    Map<String , String> mapping = new HashMap<>();

   /*  insertion  */
   mapping.put("in" ,"india");
   mapping.put("us" ,"united states");
   mapping.put("eng" ,"england");

   System.out.println(mapping);

   mapping.put("in" ,"india");
   mapping.put("in" ,"india2");
   mapping.put("us" ,"united states");
   mapping.put("eng" ,"england");

   System.out.println(mapping);

   //insertion of map into another map
   Map<String , String> table = new HashMap<>();

   table.put("jap","japan");
   System.out.println(table);

   table.putAll(mapping);
   System.out.println(table);

   //deletion
   table.remove("eng");
   System.out.println(table);

   //size
   System.out.println(table.size());

   //make empty map
   table.clear();
   System.out.println(table.size());

   //if element not present in map
   table.putIfAbsent("uk", "united kingdom");
   System.out.println(table);

   //getvalue of element
   System.out.println(table.get("uk"));
   
   //getordefault
   System.out.println(table.getOrDefault("usa", "NONE"));

   //containskey
   System.out.println(table.containsKey("in"));

   //containsvalue
   System.out.println(table.containsValue("united kingdom"));

   //replace
   table.replace("uk", "united king");
   System.out.println(table);

   //keyset finding
   Set<String> KeySet = table.keySet();
   System.out.println(KeySet);

   //valueset
   Collection<String> valueset = table.values();
   System.out.println(valueset);

   //treemap is also same as hashmap

    }
}
