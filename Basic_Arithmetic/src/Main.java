public class Main {
    int add()
    {
        int a=9;
        int b=3;

        return a+b;

    }
    int multiply()
    {
        int a=9;
        int b=3;

        return a*b;

    }
    int subtract()
    {
        int a=9;
        int b=3;

        return a-b;

    }
    float divide()
    {
        int a=9;
        int b=3;

        return (float) a/b;

    }
    public static void main(String[] args)
    {
        Main m1 = new Main();
        System.out.println(m1.add());
        System.out.println(m1.subtract());
        System.out.println(m1.multiply());
        System.out.println(m1.divide());
    }
}