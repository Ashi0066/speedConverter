public class DecimalComparator {
    // write code here
    public static boolean areEqualByThreeDecimalPlaces(double number1 , double number2)
    {
        double num = (long) (number1*1000);
        double num2= (long) (number2*1000);
        if(num==num2)
        {
            return true;
        }else{
            return false ;
        }

    }
}