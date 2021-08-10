package collections.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExample
{
    public static void main(String[] args)
    {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Gabriel", 19));
        students.add(new Student("João", 18));
        students.add(new Student("Lucas", 22));
        students.add(new Student("Jean", 23));
        students.add(new Student("Matheus", 19));
        students.add(new Student("Wallinson", 21));

        System.out.println("-- Insertion Order: --");
        System.out.println(students);

        System.out.println("\n -- Sorted Order -- (lambda)");
        students.sort((first, second) -> first.getAge() - second.getAge());

        System.out.println(students);

        System.out.println("\n -- Inverse Order -- (lambda)");
        students.sort((first, second) -> second.getAge() - first.getAge());

        System.out.println(students);

        System.out.println("\n -- Sorted Order -- (method reference)");
        students.sort(Comparator.comparingInt(Student::getAge));

        System.out.println(students);

        System.out.println("\n -- Inverse Order -- (method reference)");
        students.sort(Comparator.comparingInt(Student::getAge).reversed());

        System.out.println(students);

        System.out.println("\n -- Sorted Order -- (interface Comparable)");
        Collections.sort(students);

        System.out.println(students);

        System.out.println("\n -- Inverse Order -- (interface Comparator)");
        Collections.sort(students, new StudentReverseOrderComparator());

        System.out.println(students);
    }
}