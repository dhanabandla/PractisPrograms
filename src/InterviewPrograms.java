import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.*;

public class InterviewPrograms {
    public static void main(String[] args) {
        //1.count total number of charecters in string
       /* String s="dhana aruna sudha";
        char ch[]=s.toCharArray();
        int count=0;
        int space=0;
        for(int i=0;i<ch.length;i++)
        {
            if(Character.isLetter(ch[i]))
            {
                count++;
            }
            if(Character.isSpaceChar(ch[i]))
            {
                space++;
            }

        }
        System.out.println(count+space);
        // if(Character.isLetter(ch[i]))
        // if(ch[i]!=' ')
        //if(s.charAt(i)!=' ')*/

        //Find number of vowels and consonents in string and print the vowels,consonents
        /*Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
       String vow="";
       String con="";
        //int vowels=0;
       // int consonents=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
            {
                vow=vow+ch[i];
                //vowels++;

            }
            else
                con=con+ch[i];
            //consonents++;

        }
       System.out.println(vow);
       System.out.println(con);
        //System.out.println("number of vowels in a string :"+vowels);
        //System.out.println("number of consonents in a string :"+consonents);*/

        //find both strings are anagram or not
        /*String s1="dhana";
        s1=s1.toLowerCase();
        char ch1[]=s1.toCharArray();
        String s2="Handa";
        s2=s2.toLowerCase();
        char ch2[]=s2.toCharArray();
        if(s1.length()!=s2.length())
        {
            System.out.println("given strings are not anagram");
        }
        else
        {
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            boolean flag=Arrays.equals(ch1,ch2);
            if(flag==true)
                System.out.println("strings are anagram");
            else
                System.out.println("strings are not anagram");

        }*/

        //remove empty spaces in a string
        /*String s=" dhana  lakshmi bandla ";
        String s1[]=s.split(" ");
        System.out.println(s1.length);
        for(int i=0;i<s1.length;i++)
        {
            System.out.print(s1[i]);

        }*/

        //Reverse of charecters in a string
        /* String s="dhana lakshmi";
        //char ch[]=s.toCharArray();
        for(int i=s.length()-1;i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }*/

        //reverse of words in a string
        /*    String s="dhana lakshmi bandla";
        String s1[]=s.split(" ");
        for(int i=s1.length-1;i>=0;i--)
        {
            System.out.print(s1[i]+" ");
        }*/

        //check whether string is palindrome or not
       /* String s="madam madam";
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
           rev=rev+s.charAt(i);
        }
         if(rev.equals(s))
        {
            System.out.println("given string is palindrome");
        }
        else
            System.out.println("given string not a palindrome");*/

        //find duplicate charecters in a string
       /* String s="greeksforgeeks";
        char ch[]=s.toCharArray();
        Map<Character,Integer> m=new HashMap<Character,Integer>();
        for(int i=0;i<ch.length;i++)
        {
            int count=1;
            if(m.containsKey(ch[i]))
            {
                m.put(ch[i],(m.get(ch[i])+1));
            }
            else
            {

                m.put(ch[i],1);
            }
        }
        for(Map.Entry<Character,Integer> m1:m.entrySet())
        {
            if(m1.getValue()>1)
            {
                System.out.println(m1.getKey()+" : "+m1.getValue());
            }
        }
        //System.out.println(m.entrySet());*/

        //Remove dupliacte words in a sentence
        /*String s="dhana bandla dhana sudha bandla";
        String s1[]=s.split(" ");
        Set<String> se=new HashSet<String>();
        for(int i=0;i<s1.length;i++)
        {
            se.add(s1[i]);

        }
        for(String se1:se)
        {
            System.out.print(se1+" ");
        }*/

        //number of words in a string
        /*String s=" dhana udha mani ";
        String s1[]=s.split(" ");
        int count=0;
        //System.out.println(s1.length);
        for(int i=0;i<s1.length;i++)
        {
            //if(!s1[i].trim().equals(""))
            if(!s1[i].replace(" ","").equals(""))
            {
                count++;
            }
        }
        System.out.println(count);*/

        //swap two strings using temp variable
        /*String s1="dhana";
        String s2="lakshmi";
        String temp;
        temp=s1;
        s1=s2;
        s2=temp;
        System.out.println(s1+" "+s2);*/

        //swapping of two strings without using third variable
       /* String s1="dhana";
        String s2="lakshmi";
        s1=s1+s2;//dhanalakshmi
        s2=s1.substring(s1.length()-s2.length());
        System.out.println(s2);
*/

        //each word start letter is capital
       /* String s="dhana Is GOOD";
        String s1[]=s.split(" ");
        for(int i=0;i<s1.length;i++)
        {
            String first=s1[i].substring(0,1);
            String second=s1[i].substring(1);
            first=first.toUpperCase();
            second=second.toLowerCase();
            System.out.println(first+second);
        }*/

        //converting char array to string
        /*   char ch[]={'d','h','a','n','a'};
        //String s=String.valueOf(ch);
        String s=new String(ch);
        System.out.println(s);*/

        //compare two strings with equals and compare keywords
        /*String s1="dhana";
        String s2="shana";
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));*/

        //using substring
       /* String s="dhana lakshmi";
        System.out.println(s.substring(0,5));//will get from 0 to 4
        System.out.println(s.substring(6));//will get from 6th to end letter*/

        //Trim the white spaces
        /* String s=" dhana - lakshmi ";
        s=s.trim();//"dhana - lakshmi"
        String s1[]=s.split("-");
        String firsts=s1[0].trim();//"dhana"
        String seconds=s1[1].trim();//"lakshmi"
        System.out.println(firsts);
        System.out.println(seconds);*/

        //keep alphabets and spaces
        /*  String s="abc c@#$";
        s=s.replaceAll("^[a-zA-z ]","");
        System.out.println(s);*/

        //convert string to int
        /*String s="122";
        System.out.println(Integer.parseInt(s));*/

        //convert int to string
        /* int n=125;
        String ss1=String.valueOf(n);
        System.out.println(ss1+1);*/

        //Remove consecutive letters in String
        /*String s="ddhaanna";
        for(int i=0;i<s.length();i++)
        {

            if(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)) {
                continue;
            }
            else
                System.out.print(s.charAt(i));
        }*/

        //Remove consecutive elements in array and string
        /*String s="dhana";
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i+=2)
        {

            System.out.println(ch[i]);
        }*/

        //find given number is prime or not
        /*int a=24;
        int count=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("given number is prime");
        }
        else
            System.out.println("given number is not a prime");
*/

        //print prime numbers between 1 to 100
        /*int n=100;
        for(int i=1;i<=n;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                  count++;
                }
            }
            if(count==2)
            {
                System.out.print(i+" ");
            }
        }*/

        //check given number is even or odd
        /* int a=23;
        /*if(a%2==0)
        {
            System.out.println(a+" is even number");
        }
        else
            System.out.println(a+" is odd number");*/

        //some of first 10 natural  numbers
        /* int n=10;
        int sum=0;
       for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);*/

        //find given charecter is alphabet or not
        /*char ch='Z';
        if(ch>='a' && ch<='z'||ch>='A' && ch<='Z')
        {
            System.out.println(ch+" is alphabet");
        }
        else
            System.out.println(ch+" not an aphabet");*/

        //factors of given number
        /*int n=24;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
            }
        }*/

        //find the factors for 1 to 100 numbers
        /*int n=100;
        for(int i=1;i<=n;i++)
        {
            int count=0;
            System.out.print("Factors for "+i+" is ");
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
*/

        //find given year is leap year or not
        /*int a=2000;
        if(a%4==0 && a%400==0)
        {
            System.out.println("given year is lear ");
        }
        else
            System.out.println("not a leap year");*/

        //find leap year in list of years
        /*int a[]={1990,2000,2001,2003,1978};
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%4==0 && a[i]%400==0)
            {
                System.out.println(a[i]+" is leap year");

            }
            else
                System.out.println(a[i]+" is not leap year");
        }*/

        //find factorial of a number
        /*int n=6;
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);*/

        //copying of array into another array
        /*int a[]={1,2,3,4};
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i];
            System.out.println(b[i]);
        }*/

        //removing duplicate elements in an array
        /*int a[]={1,3,3,5,5,6,6,3};
        HashSet s=new HashSet();
        for(int i=0;i<a.length;i++)
        {
            s.add(a[i]);
        }
        System.out.print(s); */

        //print duplicate elements in an array
        /* int a[]={1,3,3,5,5,6,6,3};
        HashSet s=new HashSet();
        for(int i=0;i<a.length;i++)
        {
            if(!s.add(a[i]))
            {
                System.out.print(a[i]);
            }
        }
*/

        //reverse an array
        /*int a[]={2,3,4,6,7,8};
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }*/

        //palindrome of an number
       /* int n=121;
        int sum=0;
        int r=0;0
        while(n>0)
        {
            r=n%10;//1//2//1
            sum=sum*10+r;//1//12//
            n=n/10;//12//1

        }
        if(n==sum)
        {
            System.out.println("given number is palindrome");
        }
        else
            System.out.println("not a palindrom");*/

        //number format exception
        /*String  s="123";
        int a=Integer.parseInt(s);
        System.out.println(a);*/

        //nullpointer exception
        /*String s=null;
        System.out.println(s.length());*/

        //byliteral and new string
        /*String s1="dhana";//it stores in string pool constant
        String s2="dhana";
        String s3=new String("dhana");//stores in heap memory
        String s4=new String("dhana");
        System.out.println(s1==s2);//true
        System.out.println(s3==s4);//false
        System.out.println(s2.equals(s3));//true
        System.out.println(s1.equals(s2));//true*/

        //replace aa with bb and bb with aa
        /*String s="aabbaabb";
        String s2="";
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if(c[i]=='a')
            {
                c[i]='b';
                s2=s2+c[i];
            }
            else {
                c[i]='a';
                s2=s2+c[i];


            }
        }
        System.out.println(s2);*/

        //count numbers in a given string

        /*String s="dha23ana";
      char ch[]=  s.toCharArray();
      int sum=0;
      for(int i=0;i<ch.length;i++)
      {
          if(Character.isDigit(ch[i]))
          {
             char c=ch[i];
              int v=Integer.parseInt(String .valueOf(c));
              sum=sum+v;
          }


      }
        System.out.println(sum);*/

//find second and third largest numbers in array without using sort method

        /*int a[]={3,5,7,9,12,45};
        int max=Integer.MIN_VALUE;
        int secondlar=Integer.MIN_VALUE;
        int thirdlar=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
               secondlar=thirdlar;
               thirdlar=max;
               max=a[i];
            }
            else if(a[i]<max && a[i]>secondlar)
            {
                thirdlar=secondlar;
                secondlar=a[i];
            }
            else if(a[i]<secondlar && a[i]>thirdlar)
            {
                thirdlar=a[i];
            }

        }
        System.out.println("max :"+max);
        System.out.println("second max :"+secondlar);
        System.out.println("third max :"+thirdlar);*/

        //count only capitals in a given string

        /*String s="Dhana Is";
        int upper=0;
        int lower=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            {
                upper++;
            }
            else {
                lower++;
            }
        }
        System.out.println(upper);
        System.out.println(lower);*/

        //find second/third/first element in an array

        /*int a[]={1,4,6,8,8,9};
        int firmax=a[0];
        int seconmax=Integer.MIN_VALUE;
        int thirdmax=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++) {
            if (a[i] > firmax) {
                firmax = a[i];
            }
        }
        for(int i=0;i<a.length;i++) {
            if (a[i] > seconmax && a[i] < firmax) {
                seconmax = a[i];
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]>thirdmax && a[i]<seconmax)
            {
                thirdmax=a[i];
            }
        }
        System.out.println(firmax);
        System.out.println(seconmax);
        System.out.println(thirdmax);*/

        //reverse a string
        //find dupliactes
        /*String s="dhananna";
        char ch[]=s.toCharArray();
        Map<Character,Integer> m=new HashMap<>();
        for(int i=0;i<ch.length;i++)
        {
            int count=1;
            if(m.containsKey(ch[i]))
            {
                m.put(ch[i],(m.get(ch[i])+1));
            }
            else
            {
                m.put(ch[i],1);
            }
        }
        System.out.println(m.entrySet());*/
        /*for(Map.Entry<Character,Integer> m1:m.entrySet())
        {
            if(m1.getValue()>1)
            {
                System.out.println(m1.getKey()+" "+m1.getValue());
            }

        }*/
/*        String s = " dhana  lucky ma ";
        String s1=s.trim();
        String[] words = s1.split("\\s+");//\s nothing but delimiter, it will remove one or more spaces in between strings
        int wordCount = words.length;
        System.out.println("Word count: " + wordCount); // Output: Word count: 3*/

        /*ArrayList<String> a=new ArrayList<String>(Collections.nCopies(5, "dhana"));
        System.out.println(a);*/
        /*String s="dhana";
        ArrayList a =new ArrayList();

        for(int i=1;i<=5;i++)
        {
          a.add(s);
        }
        System.out.println(a);
*/




















































    }
}


