package com.selenium;

import java.lang.reflect.Array;
import java.util.*;

public class Clientroundprograms {

    public static void main(String[] args) {

// sort the string in alphabetical order
/*        String s="dhana lakshmi bandla";
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        //convert char to string
        String s1=String.valueOf(ch);
        //String s1=new String(ch);
        System.out.println(s1);*/

        //count the even numbers in an arrayliast the input from the user
       /* Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the arraylaist");
        int size=sc.nextInt();
        System.out.println("enter the numbers in arrayliast");
        ArrayList<Integer> a=new ArrayList();
       for(int i=0;i<size;i++){
           a.add(sc.nextInt());
       }
       int count=0;
      for(int j=0;j<a.size();j++)
      {
          if(a.get(j)%2==0)
          {
              count++;


          }
      }
        System.out.println("count of even numbers in an arrayliast is "+count);*/

        //write a program to remove duplicates from the arraylist

       /* ArrayList<Integer> a =new ArrayList<>(Arrays.asList(12,35,1,10,34,1));
        //LinkedHashSet will maintain the insertion order
        LinkedHashSet<Integer> s=new LinkedHashSet<Integer>(a);
        //s.addAll(a);
        a.clear();
        a.addAll(s);
        ArrayList<Integer> removeduplicates=a;
        System.out.println(removeduplicates);*/

        //print only the even numbers from arraylist

        /*ArrayList<Integer> a=new ArrayList<>(Arrays.asList(2,3,4,5,6,12,42));
        ArrayList<Integer> evennumbers=new ArrayList<>();
        for(int i=0;i<a.size();i++)
        {
            if(a.get(i)%2==0)
            {
                evennumbers.add(a.get(i));
            }
        }
        System.out.println(evennumbers);*/

        //String =Geeks output=skeg

   /*     String s="Geeks";
        String rev="";
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        LinkedHashSet<Character> lh=new LinkedHashSet();
        for(char ch:rev.toCharArray()){

            lh.add(ch);
        }
       // System.out.println(lh);
        StringBuffer sf=new StringBuffer();
        for(char lh1:lh)
        {
            sf.append(lh1);
        }
        System.out.println(sf.toString());*/

        //find the vowels in publicissapient

        /*String s="publicissapient";
        int vowel=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vowel++;
            }
        }
        System.out.println(vowel);*/

        //write aprogram to reverse arraylist
        /*ArrayList<Integer> a=new ArrayList<>(Arrays.asList(12,35,1,10,34));
        ArrayList<Integer> b=new ArrayList<>();

        for(int i=a.size()-1;i>=0;i--)
        {
            b.add(a.get(i));

        }
        System.out.println(b);*/

        //write a java program to find duplicates charecters in a string without using the colelctions
        /*String s="dhana";
        String dup="";
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                {
                    dup=dup+ch[i];
                    break;
                }
            }
        }
        System.out.println(dup);*/

        //write a java program to find duplicates charecters in a string using the colelctions

        /*String s="aabbcc";
        HashMap<Character,Integer> h=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            if(h.containsKey(ch))
            {
                h.put(ch, h.get(ch)+1);
            }
            else {
                h.put(ch, 1);
            }
        }
        System.out.print("duplicate charecters are : ");
        for(Map.Entry<Character,Integer> entry: h.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.print(entry.getKey());
            }

        }*/
        //Strings are anagram
        /*String s1="dhanA";

        char[] ch1=s1.toLowerCase().toCharArray();
        String s2="anhda";
        char[] ch2=s2.toLowerCase().toCharArray();
        int n1=s1.length();
        int n2=s2.length();
        if(n1!=n2)
        {
            System.out.println("String were not anagram");
        }
        else {
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if(Arrays.equals(ch1, ch2)==true)
            {
                System.out.println("strings are anagram");
            }
            else
                System.out.println("strings were not anagram");




        }*/

































    }

}
