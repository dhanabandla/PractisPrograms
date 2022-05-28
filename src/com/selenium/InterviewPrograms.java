package com.selenium;

import java.util.Arrays;

public class InterviewPrograms {
    public static void main(String[] args) {
       /* int a[]={10,4,5,1,7,8,9};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));*/
        /*String s="i am dhana";
        String rev="";
        String a[]=s.split(" ");
        for(int i=a.length-1;i>=0;i--)
        {

            char ch[]=a[i].toCharArray();
            for(int j=ch.length-1;j>=0;j--)
            {
                System.out.print(ch[j]);

            }
            System.out.print(" ");

        }*/
        /*String s="i am dhana";
        String a[]=s.split(" ");
        for(int i=a.length-1;i>=0;i--)
        {

            for(int j=a[i].length()-1;j>=0;j--)
            {
                System.out.print(a[i].charAt(j));


            }
            System.out.print(" ");

        }*/

       // System.out.print(rev);

        /*char ch[]={'d','h','a','n','a'};
       // String s=new String(ch);
        String s=String.valueOf(ch);
        System.out.println(s);*/
        //equals method used for content comparision
        //== equal opearator used for reference comparision
        //new string always srores in heap
        //byliteral string stores in string constant pool
        /*String s1="dhana";
        String s2="dhan";
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);*/
       /* String s="dhana";
        String s1=new String("dhana");
        System.out.println(s.equals(s1));
        System.out.println(s==s1);
*/
        /*String str11="ssttdfrnn";
        for(int i=0;i<str11.length();i++)
        {
            if(i<str11.length()-1 && str11.charAt(i)==str11.charAt(i+1))
            {
                continue;
            }
            else
            {
                //System.out.println(s.charAt(i));
                System.out.print(str11.charAt(i));
            }
        }
*/
        /*int a1[]={2,3,5,6,7};
        int a2[]={6,3,5,6,0};
        for(int i=0;i<a1.length;i++)
        {
            int count=0;
            for(int j=0;j<a2.length;j++)
            {
                if(a1[i]==a2[j])
                {
                   count++;
                }

            }
            if(count==2)
            {
                System.out.print(a1[i]+" ");
            }

        }*/
        /*int a1[]={2,3,5,6,7};
        for(int i=0;i<a1.length;i++)
        {
            int temp;
            for(int j=i+1;j<a1.length;j++)
            {
                if(a1[i]<a1[j])
                {
                    temp=a1[i];
                    a1[i]=a1[j];
                    a1[j]=temp;
                }

                }
            System.out.print(a1[i]+" ");
            }*/
        int a1[]={2,3,5,6,7};
        int max=a1[0];
        for(int i=0;i<a1.length;i++)
        {
                if(a1[i]>max)
                {
                    max=a1[i];

                }

            }
        System.out.print(max);




















    }

}
