package dataStructure.circularLinkedList;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        CircularLinkedList<Integer> list = new CircularLinkedList<>();

        System.out.println("Is the list empty? " + list.isEmpty());

        for (Integer number : Arrays.asList(0, 1, 2, 3, 4, 5, 6)) {
            list.add(number);
        }

        System.out.println(list);

        System.out.println("The removed element: " + list.remove(0));
        System.out.println("The removed element: " + list.remove(1));
        System.out.println("The removed element: " + list.remove(list.size() - 1));

        System.out.println(list);

        list.add(7, 0);
        list.add(8);
        list.add(10, list.size());

        System.out.println(list);

        System.out.println("Size of the list: " + list.size());

        System.out.println("Number in the index 1: " + list.get(1));
    }
}