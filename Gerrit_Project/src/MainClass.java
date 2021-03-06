//....................................
class Krishnamurthy
{
    static int factorial(int n)
    {
        int fact = 1;
        while (n != 0)
        {
            fact = fact*n;
            n--;
        }
        return fact;
    }
    static boolean isKrishnamurthy(int n)
    {
        int sum = 0;   // Comment 123..
 
        int temp = n;
        while (temp != 0)
        {
            sum += factorial(temp%10);
            temp = temp/10;
        }
        return (sum == n);
    }
    public static void main(String[] args)
    {
        int n = 145;
        if (isKrishnamurthy(n))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}