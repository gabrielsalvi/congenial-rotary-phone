package dataStructure.stack;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        for (String person : Arrays.asList("Mikasa", "Erwin", "Armin", "Eren")) {
            stack.push(person);
        }

        System.out.println(stack);

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Pushed element: " + stack.push("Levi"));

        System.out.println(stack);
        System.out.println("Top element: " + stack.top());
    }
}