public class TryCatch {
    public static void main(String[] args) {
        int i=50;
        int j=0;
        try {
            int r = i / j;
            System.out.println("this will not print as try block throws an exception");
        }
       /* catch (Exception e)
                //for all execeptions or unknown exception by using exeception class in the cathe block
        {
            System.out.println(e);
        }*/
        catch (ArithmeticException e1)
        //for specific exeception in java
        {
            System.out.println(e1);
        }
        System.out.println("it will execute now though try block throws excetion");


    }
}
