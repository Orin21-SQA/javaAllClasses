package collection;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[]args) {

        Set<Integer> integers = new HashSet<>();
        integers.add(100);
        integers.add(50);
        integers.add(40);

        for (Integer integer : integers) ;
        {

            System.out.println(integers);

        }

        integers.add(200);
        integers.remove(50);
        Set<Integer> integers1 = new HashSet<>();
        integers1.add(1000);
        integers1.add(1600);
        integers.addAll(integers1);

        for (Integer integer : integers) ;
        {

            System.out.println(integers);

        }


    }
}
