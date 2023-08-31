package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Demo {
    public static void main(String[] args) {
        Collection values = new ArrayList<>();
        values.add("Dinindu");
        values.add(2);
        values.add(3.14);
        System.out.println(values);

        //Add an element
        values.add("Sandeepani");
        System.out.println(values);
        System.out.println("-----------------");


        //Add a collection
        Collection collection = new ArrayList<>();
        collection.add("Pasindu");
        collection.add("Tharuka");
        collection.add("Bharatha");
        values.addAll(collection);
        System.out.println(values);
        System.out.println("-----------------");

        //To clear the collection
        collection.clear();
        System.out.println(collection);
        System.out.println("-----------------");

        //To check an element
        System.out.println(values.contains("Dinindu"));
        System.out.println("-----------------");

        //To check a collection
        System.out.println(values.containsAll(collection));
        System.out.println("-----------------");


        //To check is it empty or not
        System.out.println(collection.isEmpty());
        System.out.println("-----------------");

        //To get the size of the collection
        System.out.println(values.size());
        System.out.println(collection.size());
        System.out.println("-----------------");


        //To remove an element
        values.remove(2);
        values.remove(3.14);
        System.out.println(values);
        System.out.println("-----------------");


        //To convert it to a array
        Object[] myArray = values.toArray();
        System.out.println(Arrays.toString(myArray));
        System.out.println("-----------------");

        String[] myArray1 = new String[values.size()];
        values.toArray(myArray1);
        System.out.println(Arrays.toString(myArray1));
        System.out.println("-----------------");


    }
}
