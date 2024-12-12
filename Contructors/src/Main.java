// Class to demonstrate constructors
class ConstructorDemo {

    // Instance variables
    private final String name;
    private final int age;

    // Default Constructor
    public ConstructorDemo() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("Default Constructor called: Name and Age initialized to default values.");
    }

    // Parameterized Constructor
    public ConstructorDemo(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor called: Name and Age initialized to provided values.");
    }

    // Copy Constructor
    public ConstructorDemo(ConstructorDemo obj) {
        this.name = obj.name;
        this.age = obj.age;
        System.out.println("Copy Constructor called: Object values copied.");
    }

    // Method to display the object's state
    public void displayInfo() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }

    // Static factory method to demonstrate constructor usage
    public static ConstructorDemo createInstance(String name, int age) {
        return new ConstructorDemo(name, age);
    }

    public static void main(String[] args) {
        // 1. Using Default Constructor
        ConstructorDemo defaultObj = new ConstructorDemo();
        defaultObj.displayInfo();

        // 2. Using Parameterized Constructor
        ConstructorDemo parameterizedObj = new ConstructorDemo("Alice", 25);
        parameterizedObj.displayInfo();

        // 3. Using Copy Constructor
        ConstructorDemo copiedObj = new ConstructorDemo(parameterizedObj);
        copiedObj.displayInfo();

        // 4. Using Static Factory Method to create an instance
        ConstructorDemo factoryCreatedObj = ConstructorDemo.createInstance("Bob", 30);
        factoryCreatedObj.displayInfo();
    }
}
