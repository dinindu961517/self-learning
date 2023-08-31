import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        /*All the data structures in the collection API has implemented
        Iterable interface. If any object which implement the iterable
        interface can be iterated.
        There are 3 ways to iterate,
            1.using enhanced for loop
            2.using for-each loop
            3.using iterator interface

         */



        List<String> list = new ArrayList<>();
        list.add("Dinindu");
        list.add("Tharuka");
        list.add("Damith");
        list.add("Keshan");
        list.add("Pasindu");
        list.add("Chethini");
        list.add("Nuwanthi");

        /* using enhanced for loop */
        for (String s : list) {
            System.out.println("Name is "+s);
        }

        /*using for-each */
        list.forEach(s -> {
            String newElement= s.concat(" DS");
            System.out.println(newElement);
        });

        /*using the iterator interface */

        Iterator<String> iterator = list.iterator();
        System.out.println("---");
        System.out.println(iterator.next());
        System.out.println("----");
        iterator.forEachRemaining(s-> System.out.println(s));




    }
}
