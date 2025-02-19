public class MyClass {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int z = x / y; // This line causes an ArithmeticException
        System.out.println(z);
    }
}