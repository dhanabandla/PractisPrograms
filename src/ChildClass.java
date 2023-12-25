public class ChildClass extends ParentClass
{
    public void step1()
    {
        System.out.println("give preference to child class method");
    }
    public void step3()
    {
        System.out.println("step3");
    }

    public static void main(String[] args) {
        //compiletime polymorphisum (or) static polymorphisum
        /*ChildClass c=new ChildClass();
        c.step1();
        c.step2();
        c.step3();*/

        /*ParentClass c=new ParentClass();
        c.step1();//
        c.step2();*/

        //runtime polymorphism (or) dynamic polymorphism (or) topcasting
     /*   ParentClass c1=new ChildClass();//child class object can be referred by parent reference variable
        c1.step1();//override
        c1.step2();*/



        //DownCasting--->while compiling it is ok but in runtime it through classcast exception
        //ChildClass c2=(ChildClass) new ParentClass();
        /*c2.step2();
        c2.step1();
        c2.step3();
*/



    }
}
