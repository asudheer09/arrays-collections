package com.example.collection.map;

import java.util.Map;
import java.util.TreeMap;


/*class MyInteger extends  Integer{


}*/
public class TreeMapExample {
    public static final int MIN_VALUE = -2147483648;
    public static void main(String[] args) {

        MIN_VALUE=1234;

        Map<String,String> map= new TreeMap<>();
       /* map.put("abc","def");
        map.put(null,null); //NPE*/

        map.put("def","gere");
        map.put("daf","gere");
        map.put("dcf","gere");
        map.put("dbf","gere");
        map.put("dgf","gere");
        map.put("ddf","gere");

        System.out.println(map);

        Map<Integer,String> imap= new TreeMap<>();

        imap.put(45,"gere");
        imap.put(23,"gere");
        imap.put(85,"gere");
        imap.put(11,"gere");
        imap.put(33,"gere");
        imap.put(0,"gere");
        System.out.println(imap);

    }
}
