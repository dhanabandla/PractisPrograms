public class Throws {

    public void division(int i) throws ArithmeticException,NullPointerException
    {
        if(i<1)
        {
            throw new NumberFormatException();
        }

    }
    public static void main(String[] args) {
        Throws t=new Throws();
        try {
            t.division(-3);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("throw and throws exceptions");

    }
}
