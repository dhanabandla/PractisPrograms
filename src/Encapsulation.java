public class Encapsulation
{
    private int i;
    private String s;
    public void setI()
    {
        System.out.println("print i value");
    }
    public void setS()
    {
        System.out.println("print string");
    }

    public static void main(String[] args) {
        Encapsulation e=new Encapsulation();
        e.setI();
        e.setS();
    }
}
