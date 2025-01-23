public class Main {
    // 1. Basic method overloading with different parameter types
    public void display(int number) {
        System.out.println("Displaying integer: " + number);
    }

    public void display(String text) {
        System.out.println("Displaying string: " + text);
    }

    // 2. Overloading with different number of parameters
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // 3. Overloading with different parameter order
    public void printDetails(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public void printDetails(int age, String name) {
        System.out.println("Age: " + age + ", Name: " + name);
    }

    // 4. Overloading with type promotion
    public void calculate(int num1, long num2) {
        System.out.println("Result with int and long: " + (num1 + num2));
    }

    public void calculate(long num1, long num2) {
        System.out.println("Result with two longs: " + (num1 + num2));
    }

    // Main method to demonstrate all examples
    public static void main(String[] args) {
        Main demo = new Main();

        // Testing basic overloading
        demo.display(100);              // Calls int version
        demo.display("Hello World");    // Calls String version

        // Testing different number of parameters
        System.out.println("Sum of 2 numbers: " + demo.add(5, 10));
        System.out.println("Sum of 3 numbers: " + demo.add(5, 10, 15));

        // Testing different parameter order
        demo.printDetails("John", 25);
        demo.printDetails(25, "John");

        // Testing type promotion
        demo.calculate(10, 20L);        // First method
        demo.calculate(20L, 30L);       // Second method
    }
}