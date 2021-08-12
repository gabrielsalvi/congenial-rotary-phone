package collections.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample
{
    public static void main(String[] args)
    {
        List<String> students = new ArrayList<>();

        students.add("Marcos");
        students.add("Denise");
        students.add("Mayra");
        students.add("Camile");
        students.add("Adrian");
        students.add("Wallinson");
        students.add("Carla");

        System.out.println("Count: " + students.stream().count());

        System.out.println("Highest number of letters: " + students.stream().max(Comparator.comparingInt(String::length)));
        System.out.println("Lowest number of letters: " + students.stream().min(Comparator.comparingInt(String::length)));

        System.out.println("With letter 'i' in the name: " + students.stream().filter((student) ->
                student.toLowerCase().contains("i")).collect(Collectors.toList()));

        System.out.println("Returns a new collection with the name of the student and its length: " + students.stream().map(student ->
                student.concat(" - ").concat(String.valueOf(student.length()))).collect(Collectors.toList()));

        System.out.println("Returns the first 'x' elements of the list: " + students.stream().limit(3).collect(Collectors.toList()));

        System.out.println("Returns the same collection: " + students.stream().peek(System.out::println).collect(Collectors.toList()));

        System.out.println("Returns the elements without a new collection: ");
        students.stream().forEach(System.out::println);

        System.out.println("Do all the elements have the letter 'W' in the name: " + students.stream().allMatch((student -> student.contains("W"))));
        System.out.println("Is there a element with the letter 'n' in the name: " + students.stream().anyMatch((student -> student.contains("n"))));
        System.out.println("Are there none elements with the letter 'z' in the name: " + students.stream().noneMatch((student -> student.contains("z"))));

        System.out.print("First element of the collection: ");
        students.stream().findFirst().ifPresent(System.out::println);

        System.out.println(students.stream()
                .peek(System.out::println)
                .map(student ->
                        student.concat(" - ").concat(String.valueOf(student.length())))
                .peek(System.out::println)
//                .filter((student) ->
//                        student.toLowerCase().contains("r"))
//                    .collect(Collectors.toList()));
//                    .collect(Collectors.joining(", ")));
//                    .collect(Collectors.toSet()));
                    .collect(Collectors.groupingBy(student -> student.substring(student.indexOf("-") + 1))));
    }
}