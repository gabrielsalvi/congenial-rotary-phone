package dataStructure.queue;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Queue<String> queue = new Queue<>();

        System.out.println("Is the queue empty? " + queue.isEmpty());

        for (String person : Arrays.asList("Neymar", "Messi", "Ronaldo", "Haaland")) {
            queue.enqueue(person);
        }

        System.out.println(queue);

        System.out.println("Dequeued Element: " + queue.dequeue());
        queue.enqueue("Reus");

        System.out.println(queue);
        System.out.println("First Element: " + queue.first());

        queue.dequeue();
        System.out.println(queue);

        System.out.println("Is the queue empty? " + queue.isEmpty());
    }
}