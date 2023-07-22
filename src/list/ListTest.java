package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest<strings> {
    public static void main(String[]args){
        List<String>strings=new ArrayList<>();//add
        strings.add("Farhana");//index 0
        strings.add("Sharmin"); //index 1
        strings.add("Orin");//index 2
System.out.println("=================");

        strings.add(0, "Hello");//update


        for (String s:strings){
            System.out.println(s);
}

System.out.println("=================");
System.out.println(strings.get(2));

 strings.remove("0");//remove

        for (String s:strings){
            System.out.println(s);
        }


List<String> fruits= Arrays.asList("mango","banana");//add all
strings.addAll(fruits);

strings.removeAll(fruits);

        for (String s:strings){
            System.out.println(s);
        }





}

}