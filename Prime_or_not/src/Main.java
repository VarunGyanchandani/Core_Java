public class Main
{
    public int prime_or_not(int n)
    {
        for(int i=2;i<=n-1;i++)
        {
            if(n%i == 0)
            {
                return -99;
            }
        }
        return 1;

    }
    public static void main(String[] args)
    {
        Main m1 = new Main();
        if(m1.prime_or_not(769) == 1){
            System.out.println("This number is prime.");
        }
        else{
            System.out.println("This number is not prime.");
        }
    }
}