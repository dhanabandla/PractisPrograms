public class MethodHiddingChild extends MethodHodding
{
    public static void m3()
    {
        System.out.println("m3");
    }
    public static void m2()
    {
        System.out.println("overriding");
    }

    public static void main(String[] args) {
        MethodHiddingChild m=new MethodHiddingChild();
        /*m.m1();
        m.m2();
        m.m3();*/
       MethodHodding m1=new MethodHiddingChild();
        m.m1();
        m.m2();
        m.m3();

    }
}
