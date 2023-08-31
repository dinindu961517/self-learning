package lk.ijse.dep10.dataStructures.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ARrayList {
    public static void main(String[] args) {
        ArrayList arrayList1 = new ArrayList<>();
        arrayList1.add(5);
        arrayList1.add("Dinindu");
        arrayList1.add(2.56);
        System.out.println(arrayList1);
        System.out.println("-----------------");

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Dinindu");
        arrayList.add("Chethini");
        arrayList.add("Pasindu");
        arrayList.add("Tharuka");
        System.out.println(arrayList);
        System.out.println("-----------------");


        //to add an element
        arrayList.add("Bathiya");
        System.out.println(arrayList);
        System.out.println("-----------------");

        //to remove an element
        arrayList.remove(4);
        arrayList.remove("Tharuka");
        System.out.println(arrayList);
        System.out.println("-----------------");

        //to access an element
        String Boy = arrayList.get(1);
        System.out.println(Boy);
        System.out.println("-----------------");

        //to set an element
        arrayList.set(2, "Chethini");
        System.out.println(arrayList);
        System.out.println("-----------------");

        //to get the size of the list
        System.out.println(arrayList.size());
        System.out.println("-----------------");


        //to check the array is empty or not
        System.out.println(arrayList.isEmpty());
        System.out.println("-----------------");

        //TO get an iterator
        Iterator iterator = arrayList.iterator();
        int myInt = 0;
        iterator.forEachRemaining((s)->{
            System.out.println("New "+s);

        });
    }
}
