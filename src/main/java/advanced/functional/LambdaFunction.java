package advanced.functional;

public class LambdaFunction
{
    public static void main(String[] args)
    {
        Function function = str -> "Mr. " + str;
        System.out.println(function.generate("Compress"));
    }
}

// usually in another file...
@FunctionalInterface
interface Function {
    String generate(String str);
}