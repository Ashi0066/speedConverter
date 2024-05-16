public class LeapYear {
    // write code here

    public static boolean isLeapYear(int year){


        if(year<1 || year>9999)
        {
            return false;
        }else{
            return (year%4==0 ) && (year%100!=0)||year%400==0;
        }


    }
    public static boolean areEqualByThreeDecimalPlaces(double number1 , double number2)
    {
        boolean num = (float) Math.round(number1)==Math.round(number2);
        if(num)
        {
            return true;
        }else{
            return false ;
        }

    }

}