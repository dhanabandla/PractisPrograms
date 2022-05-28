public class Constructor {
    int i=10;
    String s="dhana";
    public Constructor(int i,String s)
    {
        this.i=i;
        this.s=s;
        System.out.println(i);
        System.out.println(s);
    }

    public static void main(String[] args) {
        Constructor s=new Constructor(5,"sudha");

    }

}
