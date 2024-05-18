public class MethodOverloadingChallenge
{


    // A class showing how method overloading allow methods to be used in other methods
    public static void main(String[] args)
    {

        System.out.println(convertToCentimeters(5));
        System.out.println(convertToCentimeters(5,11));

    }

    public static double convertToCentimeters(int heightInInches){
        return  heightInInches*2.54;
    }

    public static double convertToCentimeters(int heightInFeet,int heightInInches){
      return   convertToCentimeters((heightInFeet * 12)+heightInInches);

    }
}
