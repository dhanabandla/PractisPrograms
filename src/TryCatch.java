public class TryCatch {
    public static void main(String[] args) {
        int i=50;
        int j=0;
        try {
            int r = i / j;
            System.out.println("this will not print as try block throws an exception");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("it will execute now though try block throws excetion");


    }
}
