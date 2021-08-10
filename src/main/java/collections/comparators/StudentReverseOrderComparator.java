package collections.comparators;

import java.util.Comparator;

public class StudentReverseOrderComparator implements Comparator<Student>
{
    @Override
    public int compare(final Student s1, final Student s2)
    {
        return s2.getAge() - s1.getAge();
    }
}