package part01_LambdaExpressions.pack04_VariableCapturing;

public class Main {
    // Main driver method
    public static void main(String[] args)
    {
        // Custom local variable that can be captured
        int number = 10;

        MyFunc myLambda = (n) ->
        {

            // This use of number is OK It does not modify
            // num
            int value = number + n;

            // However, the following is illegal because it
            // attempts to modify the value of number

            // number++;
            return value;
        };

        //Using the Lambda expression
        System.out.println(myLambda.func(20));
        System.out.println("Hello!");
    }
}
