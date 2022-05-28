public class LocalStatiInstance
{
    int a1=12;
    static int a2=13;

    public static void main(String[] args) {
        int a3=14;
       LocalStatiInstance a=new LocalStatiInstance();
        System.out.println(a.a1=20);
        System.out.println(a3);
        System.out.println(a2);

    }

}
