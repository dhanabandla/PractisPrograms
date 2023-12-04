package com.selenium;

public class PrintUniqueCharecter {
    public static void PrintUniqueElements(int[] a) {

        for (int i = 0; i < a.length; i++) {
            int freuency = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    freuency++;

                }

            }
            if (freuency == 1) {
                System.out.print(a[i] + " ");
            }
        }


    }

    public static void main(String[] args) {
        int[] input = {1, 2, 4, 5, 6, 6, 7};
        PrintUniqueElements(input);

    }
}
