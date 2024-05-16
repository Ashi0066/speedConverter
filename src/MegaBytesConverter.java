public class MegaBytesConverter
{
    public static void main(String[] args)
    {
        printMegaBytesAndKiloBytes(2500);
    }


    public static void printMegaBytesAndKiloBytes(int KiloBytes){

         int MegaBytes= 0;
         double KB = 0 ;

        if (KiloBytes < 0){

            System.out.println("Invalid Value");
        }else {

            MegaBytes=KiloBytes/1024;
            KB = KiloBytes%  1024;

            System.out.println(MegaBytes);
            System.out.println(KB);

        }

    }
}
