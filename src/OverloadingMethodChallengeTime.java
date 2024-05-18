public class OverloadingMethodChallengeTime
{


    public static void main(String[] args)
    {

        System.out.println(getDurationString(-1));

    }

    public static String getDurationString(int seconds){


        int minutes = seconds/60;

        if(seconds<=0){
           return "Error";


        }else {
            return  getDurationString(seconds,minutes);
        }



    }
    public static String getDurationString(int seconds,int minutes){

        int hours = minutes/60;

        int remainingMinutes = minutes%60;
        int remainingSeconds = seconds%60;

        if (minutes<=0 || seconds<=0 || seconds>=59)
        {
            return "Error";
        }else
        {

            return hours + "h" + remainingMinutes + "m" + remainingSeconds + "s";
        }
    }
    public static double area (double radius){
        if(radius<0){
            return -1 ;

        }

        return 3.14 + (radius*radius);



    }

}
