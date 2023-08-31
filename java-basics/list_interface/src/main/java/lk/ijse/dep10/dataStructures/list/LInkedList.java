package lk.ijse.dep10.dataStructures.list;

import java.util.Collection;
import java.util.LinkedList;

public class LInkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList<>();
        linkedList.add("Dininud");
        linkedList.add("Sandeepani");
        linkedList.add("Tharuka");
        linkedList.add("Bharatha");
        linkedList.add("Damith");
        linkedList.add("Keshan");
        linkedList.add("Pasindu");
        System.out.println(linkedList);
        System.out.println("------------");

        //to access elements
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.get(5));
        System.out.println("------------");

        //To add elments
        linkedList.add("Kali");
        linkedList.addFirst("Dinuka");
        linkedList.addLast("Kumara");
        System.out.println(linkedList);
        System.out.println("------------");

        //To remove elements
        linkedList.remove("Kali");
        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.remove("keshan");
        System.out.println(linkedList);
        linkedList.remove("Keshan");
        System.out.println("------------");
        System.out.println(linkedList);

        //To find an element
        System.out.println(linkedList.indexOf("Sandeepani"));
        System.out.println(linkedList.lastIndexOf("Dinidu"));


    }
}
