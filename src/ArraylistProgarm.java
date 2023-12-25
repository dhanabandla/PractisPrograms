import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistProgarm {
    public static void main(String[] args) {
        ArrayList a=new ArrayList(Arrays.asList("dhana","aruna","mani","adi","sudha"));
        ArrayList b=new ArrayList(Arrays.asList("one","two","three","four","five","dhana","mani"));
        System.out.println(a.size());
        System.out.println(a.get(2));
        /*a.addAll(b);
        System.out.println(a);
        a.removeAll(b);
        System.out.println(a);
        a.retainAll(b);
        System.out.println(a);*/
        /*String s="your password is 'QapitalQA', do not't share to any one";
        String s1[]=s.split(" ");
        for(int i=0;i<s1.length;i++)
        {
            if(s1[i].equals("'QapitalQA',"))
            {
                System.out.println(s1[i].replaceAll("'","").replaceAll(",",""));

            }
        }*/
       /* String s="your password is 'QapitalQA', do not't share to any one";
        String s1=s.replace("'QapitalQA',","QapitalQA");
        System.out.println(s1);*/

    }
}
