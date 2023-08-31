package lk.ijse.dep10.dataStructures.list;

import java.util.*;

public class LIstInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Dinindu");
        list.add("Tharuka");
        list.add("Damith");
        list.add("Keshan");
        list.add("Pasindu");
        list.add("Chethini");
        list.add("Nuwanthi");
        System.out.println(list);

        //To add an element
        boolean isAdd = list.add("Chethini");

        System.out.println(isAdd);
        System.out.println(list);
        System.out.println("-------------");

        //To add to a specific position
        list.add(2, "Nirod");
        System.out.println(list);
        System.out.println("-------------");

        //to get a element
        System.out.println(list.get(1));
        System.out.println("-------------");

        //to replace a element
        list.set(7, "Sandeepani");
        System.out.println(list);
        System.out.println("-------------");

        //to get the first occurrence of an object
        System.out.println(list.indexOf("Chethini"));
        System.out.println("-------------");

        //to get the last occurrence of an object
        System.out.println(list.lastIndexOf("Chethini"));
        System.out.println("-------------");

        //to remove a return the object
        System.out.println(list.remove(8));
        System.out.println("-------------");

        //Iterator
        ListIterator iterator1 = list.listIterator();
        System.out.println(iterator1.next());
        iterator1.forEachRemaining(s-> System.out.println(s));
        System.out.println("-------------");

        ListIterator iterator2 = list.listIterator(2);
        System.out.println(iterator2.next());
        iterator2.forEachRemaining(s-> System.out.println(s));
        System.out.println("-------------");

        List subList = list.subList(2, 5);
        System.out.println(subList);
        System.out.println("-------------");

        Collection myList=new List() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public Object[] toArray(Object[] a) {
                return new Object[0];
            }

            @Override
            public boolean add(Object o) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection c) {
                return false;
            }

            @Override
            public boolean addAll(Collection c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Object get(int index) {
                return null;
            }

            @Override
            public Object set(int index, Object element) {
                return null;
            }

            @Override
            public void add(int index, Object element) {

            }

            @Override
            public Object remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator listIterator() {
                return null;
            }

            @Override
            public ListIterator listIterator(int index) {
                return null;
            }

            @Override
            public List subList(int fromIndex, int toIndex) {
                return null;
            }
        };

    }
}
