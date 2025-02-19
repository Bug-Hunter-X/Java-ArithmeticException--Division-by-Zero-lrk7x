public class MyClass {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int z = 0;
        try {
            z = x / y;
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero!");
            //Handle exception appropriately, perhaps using a default value or logging the error
        }
        System.out.println(z); //Prints 0, or handles error based on the chosen handling method in the catch block
    }
}