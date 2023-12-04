package com.selenium;

public class Throw {
    public static void main(String[] args) {
        int age = -1;
        try {
            if (age < 0) {
                throw new IllegalArgumentException("age shouldnot contain the negative values");

            }

        }
        catch (IllegalArgumentException e)
        {
            System.out.println("error"+e.getMessage());


        }
    }





}
