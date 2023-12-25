package com.selenium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class InterviewTest {
    public static void main(String[] args) {
        //print duplicate charecters into third array
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
        }*/

        //find first highest and second higest nuber in array
       /* int a[]={1,65,99,13};
        int firstlargestnumber=0;
        int secondlargestnumber=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>firstlargestnumber)
            {
                secondlargestnumber=firstlargestnumber;//0//1//65
                firstlargestnumber=a[i];//1//65//99
            } else if (a[i]>secondlargestnumber) {
                secondlargestnumber=a[i];



            }
        }
        System.out.println("second largest number"+secondlargestnumber +" "+"first largest number"+firstlargestnumber);

*/

        //write a program to fetch values using the key in hashmap
/*
        HashMap<Integer,String> h=new HashMap<>();
        h.put(1,"dhana");
        h.put(2,"dhana2");
        h.put(3,"dhana3");
        System.out.print(h.keySet()+" ");
        System.out.print(h.values()+" ");
        System.out.println(h.get(1));*/

        /*
        //provide the instance varoable value in static method

        public class A {
            int i; // Instance variable

            static int method(int a) {
                // You cannot access the non-static instance variable 'i' directly in a static method.
                // You need an instance of the class to access 'i'.
                // If you want to access 'i' here, you need to create an instance of 'A' and use it.
                A obj = new A();
                obj.i = a; // Set the value of 'i' using the instance
                return a;
            }

            public static void main(String[] args) {
                System.out.println(A.method(12));
            }
        }*/
        //reverse each word in string using strigbuilder
        /*String rev="";
        String s="this is test";
        String s1[]=s.split(" ");
        for(int i=0;i<s1.length;i++)
        {
            StringBuilder sb=new StringBuilder(s1[i]);
            sb.reverse();
            String s2=sb.toString();
            rev=rev+s2+" ";

        }
        System.out.println(rev);
    }*/
//move zero's to last in an array
        /*int a[] = {1, 3, 0, 9, 0, 4, 5};
        int newa[] = new int[a.length];
        int count = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] != 0) {
                newa[count] = a[i];
                count++;
            }
        }

        for (int j = 0; j < newa.length; j++) {
            System.out.print(newa[j] + " ");
        }
*/
        /*public static String reverseCharacters(String input) {
            // Split the input into an array of strings, where each element is a word or special character
            String[] parts = input.split("(?<=\\W)|(?=\\W)");

            // Reverse each word (which contains only alphabets)
            for (int i = 0; i < parts.length; i++) {
                if (!parts[i].matches("\\W")) { // Check if it's not a special character
                    parts[i] = new StringBuilder(parts[i]).reverse().toString();
                }
            }

            // Join the reversed parts back into a single string
            return String.join("", parts);
        }

        public static void main(String[] args) {
            // Example usage
            String input = "dh&a#na";
            String reversed = reverseCharacters(input);

            // Display the result
            System.out.println("Input: " + input);
            System.out.println("Output: " + reversed);
        }
*/ or
        /*String s="dhh&h*a#n";
        char ch[]=s.toCharArray();
        int j=ch.length-1;
        for(int i=0;i<j;)
        {
            if(!Character.isLetter(ch[i]))
            {
                i++;
            }
            else if(!Character.isLetter(ch[j]))
            {
                j--;
            }
            else
            {
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;

            }
        }
        System.out.print(ch);


    }*/

    }


}








