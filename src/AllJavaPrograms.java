/*
import java.lang.reflect.Array;
import java.util.*;

public class AllJavaPrograms {
    public static void main(String[] args) {

//print even position charecters in string
       */
/* String s="dhana";
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i+=2)
        {

            System.out.println(ch[i]);
        }*//*


//find the given number is prime or not
    */
/*int n=3;
        int count =0;
        for(int i=1;i<=n;i++)
        {
           if(n%i==0)
           {
             count++;
           }
        }
        if(count==2)
        {
            System.out.println("given number is prime");
        }
        else
            System.out.println("given number is not prime");*//*

        //print prime numbers from 1 to 100

      */
/*int n1=100;
      for(int i=1;i<=100;i++)
      {
          int count1=0;
          for(int j=1;j<=i;j++)
          {
              if(i%j==0)
              {
                  count1++;
              }

          }
          if(count1==2)
          {
              System.out.println(i+ " : prime number");
          }
          else
              System.out.println(i+ " : not prime number");
              }*//*


//factors of given number
        */
/*int n=3;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
        }*//*


//factors from 1 to 100

        */
/*int n1=100;
        for(int i=1;i<=n1;i++)
        {
            System.out.print("factors of " +i+ " is ");
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    System.out.print(j+",");
                }


            }
            System.out.println();

        }*//*


//fibanaccci seriers
//0 1 1 2 3 5 8...
 */
/* int n1=0;
  int n2=1;
  int n3;
        System.out.print(n1+ ""+n2);
  for(int i=2;i<=10;i++) {
      n3 = n1 + n2;
      System.out.print(+n3);
      n1 = n2;
      n2 = n3;


  }*//*


        //reverse of an array
 */
/*int[] a={35,2,14,98,49};
 for(int i=a.length-1;i>=0;i--)
 {
     System.out.print(a[i]+" ");
 }*//*


//how to reverse a number
*/
/*int n=1234590;
int rev=0;
int r;
while(n>0) {
    r = n % 10;
    rev=rev*10+r;
    n = n / 10;
}
        System.out.println(rev);*//*


//reversea number using string buffer

*/
/*int n=1230976;
String s=String.valueOf(n);
StringBuffer sb=new StringBuffer(s);
        StringBuffer s1=sb.reverse();
        System.out.println(s1);*//*


//reverse a number using stringbuilder
      */
/*  int n=1230976;
        StringBuilder sb=new StringBuilder();
        System.out.println(sb.append(n));
        System.out.println(sb.reverse());*//*


//print even and odd numbers in an array

       */
/*int [] a ={2,4,6,7,9,1,3,4};
       for(int i=0;i<a.length;i++)
       {

           if(a[i]%2==0)
           {

                   System.out.print(a[i]+ " ");
           }
           }*//*


//print n even positions in an arry
       */
/* int[] a={2,5,1,23,2,1};
        for(int i=2;i<a.length;i+=2)
        {
            System.out.print(a[i]+" ");

        }*//*

//compare two strings without using buit-in function

       */
/* String s="dhana";
        String s1="dhana";
        char[] ch=s.toCharArray();
        char[] ch1=s1.toCharArray();
        boolean iscompare = false;
        for(int i=0;i<s.length();i++) {
            if(ch[i]!=ch1[i])
            {
                iscompare=false;
                break;
            }
            iscompare=true;
        }
        System.out.println("both strings are equal"+iscompare);*//*


//print some of alternative even numbers in given number

  */
/*int sum=0;
  int a[]={22,22,23,24,28,26,27,28,22,30,31,32,33,34};
  for(int i=0;i<a.length;i+=2 )
  {
      if(a[i]%2==0)
      {
          System.out.print(a[i]+ " ");;
      }
  }*//*


//extract text and country=india from String ""text=country=india"
//     String s="text=country=india";
//      String[] s1=s.split("=",2);
//        System.out.println(s1[0]+" "+s1[1]);


//I am SUDHA convert into I am sudha
        */
/*String s="I am SUDHA";
        String[] s1=s.split(" ");
        for(int i=0;i<s1.length;i++)
        {
            //String s2=s1[i].substring(0,1);
            String first=s1[i].substring(0,1);//only first letter extract
            String last=s1[i].substring(1);//except first letter remaining all will extract


            String  caps=first.toUpperCase()+last.toLowerCase();

            //System.out.print(caps+ " ");
        }*//*



//count the duplicate charecters in an array

     */
/*String s="Greeks";
     int count=0;l
     char[] ch=s.toCharArray();
     for(int i=0;i<ch.length;i++) {
         for (int j = i + 1; j < ch.length; j++) {
             if (ch[i] == ch[j]) {
                 count++;
             }
         }
     }
        System.out.println(count);*//*


//how to reverse string
       */
/* String s="abcdef";
        char[] ch =s.toCharArray();
        for(int i=ch.length-1;i>=0;i--)
        {
            System.out.print(ch[i]);
        }*//*


        //remove numbers in a string
*/
/* String s="dhana1234";
 int count=0;
 String s1="";
 char[] ch=s.toCharArray();
 for(int i=0;i<ch.length;i++)
 {
     if(Character.isLetter(ch[i]))
     {
         System.out.print(ch[i]);
     }
 }*//*


//print last first duplicate letter

*/
/*String s="greeksswwyuiai";

char[] ch=s.toCharArray();
for(int i=ch.length-1;i>=0;i--)
{
    for(int j=ch.length-2;j>=0;j--)
    {
        if(ch[i]==ch[j])
        {
            System.out.println(ch[i]);

        }
    }
    break;

}*//*

        */
/*String str3="dhana";
        String str4="dhana";
        System.out.println(str3==str4);*//*


//count charecter occurence in a string

*/
/*String s="Greeksforgeeks";
int beforereplace=s.length();
int afterreplace=s.replace("e","").length();
int count=beforereplace-afterreplace;
        System.out.println(count);*//*


//try,catch block

*/
/*try {
    int i = 8 / 0;
    System.out.println(i);

}
catch (ArithmeticException e)
{
    e.printStackTrace();
    System.out.println("try block executed successfully");
}*//*


//find missing number in an array

*/
/*int a[]={1,2,4,5,6};
int n=a.length+1;
int sum=(n*(n+1))/2;
for(int i=0;i<a.length;i++)
{
    sum=sum-a[i];
}
        System.out.println(sum);

    }
}*//*


//sort and remove the duplicate elements in an array

        */
/*int a[] = {9,1, 9, 3, 2, 2, 4, 6,6,6};
        //Arrays.sort(a);
        HashSet<Integer> a1=new HashSet<Integer>();
        for(int a2:a)
        {
            a1.add(a2);
        }
        System.out.println(a1);*//*


//remove duplicate elements in arraylist

        */
/*ArrayList<Integer> a=new ArrayList<Integer>(Arrays.asList(1,2,2,3,6,6,7,8,2,3,2));
        HashSet<Integer> set=new HashSet<Integer>(a);
        System.out.println(set);*//*


//remove find duplicate charecters using hashmap
        */
/*String s="Greeksforgeeks";
        char ch[]=s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        Integer count=1;
        for(int i=0;i<ch.length;i++)
        {
            if(map.containsKey(ch[i]))
            {
                map.put(ch[i],(map.get(ch[i])) + 1);
            }
            else {
                map.put(ch[i], 1);
            }
        }
      Set<Map.Entry<Character,Integer>> entryset=map.entrySet();
        for(Map.Entry<Character,Integer> entry:entryset)
        {
            if(entry.getValue()>1)
            {
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }*//*

//another approach

       */
/* String s = "Greeksforgeeks";
        String news="";
        for (int i = 0; i < s.length(); i++)
        {
            char ch=s.charAt(i);
            if(news.indexOf(ch)==-1)
            {
                news=news+ch;
            }
        }
        System.out.println(news);*//*


//remove duplicates in an array using hashmap

        */
/*String s[]={"dhana","mani","sudha","dhana","dhana"};
        Map<String,Integer> map=new HashMap<>();
        Integer count=1;
        for(int i=0;i<s.length;i++)
        {
            if(map.containsKey(s[i]))
            {
                map.put(s[i],(map.get(s[i])) + 1);
            }
            else {
                map.put(s[i], 1);
            }
        }
        Set<Map.Entry<String,Integer>> entryset=map.entrySet();
        for(Map.Entry<String,Integer> entry:entryset)
        {
            if(entry.getValue()>1)
            {
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }or

       for(Map.Entry<Character,Integer> m:map.entrySet())
        {
            if(m.getValue()>1)
            {
                System.out.println(m.getKey() + ":" + m.getValue());
            }
        }
*//*

//how to reverse each charecter in multiple strings
*/
/*String s="dhana sudha aruna";
char ch[]=s.toCharArray();
for(int i=ch.length-1;i>=0;i--)
{
    System.out.print(ch[i]);
}*//*


//reverse each word in a string

*/
/*
String s="dhana sudha aruna"
String[] s1=s.split(" ");
String rev="";
for(String word:s1)//dhana
{
    StringBuffer sb=new StringBuffer(word);
    StringBuffer sb1=sb.reverse();
    System.out.print(sb1+" ");


}
*//*


       */
/* int[] array = new int[]{1, 2, 3, 4, 5, 1, 2, 5,2};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                }
            }
        }*//*

        */
/*String s="dhana";
        s.concat("lakshmi");
        System.out.println(s);*//*

        */
/*String  s="dhana";
        StringBuffer sb=new StringBuffer(s);
        sb.append("dhana");
        System.out.println(s);*//*


//Largest of three numbers

*/
/*int a[]={23,1,3,5,9};
int max=0;
for(int i=0;i<a.length;i++)
{
    if(a[i]>max)
    {
        max=a[i];
    }

}
        System.out.println(max);*//*


//find 2nd maximum number
*/
/*int a[]={2,5,7,8,9};
int n=a.length;
Arrays.sort(a);
        System.out.println(a[n-4]);*//*


//print array in assending order

        */
/*int a[]={3,6,8,23,7};

        for(int i=0;i<a.length;i++)
        {
            int temp=0;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.println(a[i]);
        }*//*


//convert char to string
*/
/*char s1='s';
Character.toString(s1);
String.valueOf(s1);*//*


//find is letter

       */
/* String s="dhana345r";
        int count=0;
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetter(ch[i]))
            {
                count++;
            }
        }
        System.out.println(count);*//*


//leap year or not
        */
/*int[] array=new int[4];//int[] array={1900,400,1100,4};
       array[0]=1900;
       array[1]=400;
       array[2]=1100;
       array[3]=4;
       for(int i=0;i<array.length;i++)
       {
           if (array[i] % 4 == 0 && array[i]% 400 == 0) {
               System.out.println(array[i]+" :year is leap year");
           } else
               System.out.println(array[i]+" :not a leap year");
       }*//*

//string palindrome or not
         */
/*String s="madam";
        String temp=s;
        String rev="";
        char ch[]=s.toCharArray();
        for(int i=ch.length-1;i>=0;i--)
        {
            rev=rev+ch[i];
        }
        if(temp==rev)
        {
            System.out.println("given string is palindrome");
        }
        else
            System.out.println("given string is not palindrom");*//*


//
*/
/* String s1="dhanad45";
    String s2="dhana";
   // System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareTo(s2));*//*


//
        */
/*String str1=new String("dhana");
        String str2=new String("dhana");
        System.out.println(str1.equals(str2));*//*


           */
/*String s1="dhana";
      String s2="lakshmi";
        System.out.println(String.join("dhanu",s1,s2));
        System.out.println(String.join("",s1,s2));
        System.out.println(String.join(" ",s1,s2));
        System.out.println(String.join("-",s1,s2));*//*


//remove duplicated using set

        */
/*int a[]={1,5,6,7,8,9,9,3};
        HashSet<Integer> set=new HashSet<Integer>();
        for(int a1:a)
        {
            set.add(a1);
        }
        System.out.println(set);*//*


//covert charecter array to string

       */
/* char ch[]={'d','h','a','n','a'};
       //System.out.println(String.valueOf(ch));
        String s=new String(ch);
        System.out.println(s);*//*


//convert charecter to string
*/
/*char ch='d';
        System.out.println(ch);
        System.out.println(Character.toString(ch));*//*


//first charecter should be uppercase and rest of them are small letters
*/
/*String s="i Am DHANA";
String[] s1=s.split(" ",2);
for(int i=0;i<s1.length;i++)
{
    System.out.println(s1[i]);
}
String first=s1[0].toUpperCase(Locale.ROOT);
String last=s1[1].toLowerCase(Locale.ROOT);
String result=first+" "+last;
        System.out.print(result);*//*


//count the words in given string if having more spaces

*/
/*String s="today  is friday";
String s1[]=s.split("  ");
int count=0;
        for(int i=0;i<s1.length;i++)
        {
            if(!(s1[i].trim().equals("")))
            {
                count++;
            }
        }
        System.out.println(count);
        //or
        for(int i=0;i<s1.length;i++)
        {
            if(!(s1[i].replace(" ","").equals("")))
            {
                count++;
            }
        }
        System.out.println(count);*//*


 //find missing number in given array list
 */
/*for find missing number in given array
 first array should not have duplicates
 next array no need to be in sorted order
 and array should be in range*//*

       */
/* int a[]={10,14,4,5,13,7,8,9,2,11,12,6,1};
        int sum1=0;
        for(int i=0;i<a.length;i++)
        {
           sum1=sum1+a[i];
        }
        System.out.println(sum1);
        int sum2=0;
        for(int i=1;i<=14;i++)
        {
            sum2=sum2+i;
        }
        System.out.println(sum2);
        System.out.println("missing number in an array is "+(sum2-sum1));*//*


        //find duplicates from two different charecter arrays
       */
/* char a1[]={'a','b','c','d','e'};
        char a2[]={'d','e','f','g','h'};
        List<Character> dup=new ArrayList<>();
        for(char char1:a1)
        {
            for(char char2:a2)
            {
                if(char1==char2)
                {
                    dup.add(char1);
                    break;

                }

            }
        }
        if(!dup.isEmpty())
        {
            System.out.println("duplicates in array"+dup);
        }
        else{
            System.out.println("no duplicates charecters found");
        }
*//*













    }
}































*/
