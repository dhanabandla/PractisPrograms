import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsAndThrow {

    public void division(int i) throws ArithmeticException,NullPointerException
    {
        if(i<1)
        {
            throw new NumberFormatException();
        }

    }
    public static void main(String[] args) {
        ThrowsAndThrow t=new ThrowsAndThrow();
        t.division(-3);
        System.out.println("throw and throws exceptions");

    }
}
