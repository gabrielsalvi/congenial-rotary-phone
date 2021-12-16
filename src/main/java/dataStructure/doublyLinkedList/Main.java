package dataStructure.doublyLinkedList;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList<String> list = new DoublyLinkedList<>();

        System.out.println("Is the list empty? " + list.isEmpty());

        for (String person : Arrays.asList("Flamengo", "Internacional", "Santos", "Cruzeiro", "Atlético-MG")) {
            list.add(person);
        }

        System.out.println(list);

        System.out.println("The removed element: " + list.remove(0));

        System.out.println(list);

        System.out.println("The removed element: " + list.remove(2));

        System.out.println(list);

        System.out.println("The removed element: " + list.remove(list.size() - 1));

        System.out.println(list);

        list.add("Palmeiras", 0);
        list.add("São Paulo", list.size());

        System.out.println(list);

        System.out.println("Size of the list: " + list.size());
    }
}