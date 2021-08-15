package advanced.functional;

public class LambdaFunction
{
    public static void main(String[] args)
    {
        LamFunction function = str -> "Mr. " + str;
        System.out.println(function.generate("Compress"));
    }
}

// usually in another file...
@FunctionalInterface
interface LamFunction {
    String generate(String str);
}