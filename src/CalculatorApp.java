public class CalculatorApp {
    public static void main(String[] args) {
        int number1 = 3;
        int number2 = 4;
        int addResult = add(number1, number2);
        System.out.println("Result: " + addResult);


        double doubleResult = divide(9, 0);
        System.out.println("Result: " + doubleResult);
    }

    // access-modifier static return-value methodName(parameters)
    // public static void/int doSomething(int x, int y)

    public static int add(int a, int b) {
        int result;
        result = a + b;
        return result;
    }

    public static int substract(int a, int b){
        return a - b;
    }

    public static double divide(int a, int b) {
        if (b != 0) {
            return a / (b * 1.0);
        } else {
            System.out.println("division by zero not possible!!!");
            return 0;
        }
    }
}
