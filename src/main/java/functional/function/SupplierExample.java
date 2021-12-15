package functional.function;

import java.util.function.Supplier;

public class SupplierExample
{
    public static void main(String[] args)
    {
        Supplier<Person> suppliers = () -> new Person();
        Supplier<Person> suppliersReferenceMethod = Person::new;

        System.out.println(suppliers.get());
        System.out.println(suppliersReferenceMethod.get());
    }
}

class Person
{
    private String name;
    private Integer age;

    public Person()
    {
        this.name = "Lionel Messi";
        this.age = 34;
    }

    @Override
    public String toString()
    {
        return String.format("name: %s - age: %d", this.name, this.age);
    }
}