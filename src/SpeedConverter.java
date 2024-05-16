public class SpeedConverter
{

    public static void main(String[] args)
    {
       long v=  toMilesPerHour(1.5);
        System.out.println(v );

    }

    public static long toMilesPerHour(double KilometersPerHour){

        double miles = 0;
        if(KilometersPerHour < 0 ){
            return -1 ;
        }else{

            miles =  KilometersPerHour/1.609;

            return Math.round(miles);



        }
    }

    public static void printConversion(double KilometersPerHour)
    {

        if(KilometersPerHour <0){
            System.out.println("Invalid Value");
        }else{
            double miles = KilometersPerHour/1.609;

            System.out.println(KilometersPerHour + " km/h = " + Math.round(miles)+" mi/h");
        }

    }








}

