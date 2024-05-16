public class BarkingDOg
{
    public static void main(String[] args)
    {
      Boolean shouldWakeUp =   shouldWakeUp(true,22);
        System.out.println(shouldWakeUp);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay)
    {
        if (hourOfDay>23|| hourOfDay<0)
        {
            return false ;
        }else if (barking && (hourOfDay<8 || hourOfDay<23))
        {return true;}else {return false;}
    }

    public static boolean hasTeen(int age1 , int age2 , int age3){

        if(age1 <=0 && age2<=0 && age3<=0){
            return false;
        }else if(age1>=13 || age1<=19)
        {
            return true;
        } else if (age2>=13 || age2<=19)
        {
            return true;
        }else if(age2>=13 || age2<=19){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isTeen(int age){

        if(age >=13 && age <=19 )
        {
            return true;
        }else{
            return false ;
        }
    }



}
