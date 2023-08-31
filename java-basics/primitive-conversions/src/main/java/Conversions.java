public class Conversions {
    public static void main(String[] args) {


        /*Identity Conversions */
        int num1 = 15;   /* (int) = (int) */
        boolean flag = true;   /* (boolean) = (boolean) */

        /*widening conventions
            1. byte  to short,int,long,float or double
            2. short to int,long,float or double
            3. char  to int,long,float or double
            4. int   to long,float or double
            5. long  to float or double
            6. float to double
         */

        byte myByte = 5;
        short myShort = myByte; /* <-widening conversion */


    }
}