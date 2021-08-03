package collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample
{
    public static void printFoodOrders(Queue<String> foodOrders)
    {
        System.out.println("\nQueue of Food Orders: ");

        for (String foodOrder : foodOrders)
        {
            System.out.println("-->" + foodOrder);
        }

        System.out.println();
    }

    public static void main(String[] args)
    {
        Queue<String> foodOrders = new LinkedList<>(); // FIFO - first in first out

        foodOrders.add("Pizza");
        foodOrders.add("Omelet");
        foodOrders.add("Soup");
        foodOrders.add("Pasta");

        printFoodOrders(foodOrders);

        System.out.println("1º order: " + foodOrders.poll() + " is delivered and removed from the queue!");

        printFoodOrders(foodOrders);

        System.out.println("Now the first food order in the queue is " + foodOrders.peek());

        printFoodOrders(foodOrders);

        foodOrders.clear();

        // foodOrders.element(); // if the queue is empty an exception will be thrown, else it returns the head element
    }
}
