public class AreaCalculator
{
    // write code here


    public static double area(double radius)
    {
        if (radius < 0)
        {
            return -1;

        }

        return 3.141592653589793238462643383279502884197 * (radius * radius);


    }

    public static double area(double x, double y)
    {
        if (x < 0 || y < 0)
        {
            return -1;

        }

        return x * y;


    }

    public static void printEqual(int a, int b, int c)
    {

        if ((a < 0 || b < 0 || c < 0))
        {

            System.out.println("Invalid Value");
        } else if (a == b ||b==c || c==a){

        }

    }
}

