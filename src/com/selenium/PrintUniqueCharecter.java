package com.selenium;

public class PrintUniqueCharecter {
    /*public static void PrintUniqueElements(int[] a) {

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

    }*/
    public class DuplicateValuesExample {
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 1, 2, 5};

            Set<Integer> uniqueSet = new HashSet<>();
            Set<Integer> duplicateSet = new HashSet<>();

            for (int value : array) {
                if (!uniqueSet.add(value)) {
                    // If it's not added to the set, it's a duplicate
                    duplicateSet.add(value);
                }
            }

            System.out.println("Duplicate values: " + duplicateSet);
        }
    }
}
