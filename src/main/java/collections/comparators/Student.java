package collections.comparators;

public class Student implements Comparable<Student>
{
    private final String name;
    private final Integer age;

    public Student(final String name, final Integer age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return this.name;
    }

    public Integer getAge()
    {
        return this.age;
    }

    @Override
    public String toString()
    {
        return this.name + " - " + this.age;
    }

    @Override
    public int compareTo(Student student)
    {
        return this.getAge() - student.getAge();
    }

}