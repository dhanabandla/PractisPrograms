public class ImplimentsInterface implements Interface1
{



    @Override
    public void step1() {
        System.out.println("step1");
    }

    @Override
    public void step2()
    {
        System.out.println("step2");

    }

    @Override
    public void step3() {
        System.out.println("step3");

    }
    public void step4()
    {
        System.out.println("step4");
    }

    public static void main(String[] args) {
        System.out.println(Interface1.a);
        //complie time polymorphism
       /* ImplimentsInterface i=new ImplimentsInterface();
        i.step1();
        i.step2();
        i.step3();
        i.step4();*/

        //runtime polymorphism
        Interface1 i=new ImplimentsInterface();
        i.step1();
        i.step2();
        i.step3();



    }

}
