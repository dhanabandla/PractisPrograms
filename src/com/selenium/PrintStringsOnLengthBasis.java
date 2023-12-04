package com.selenium;

import java.util.*;

public class PrintStringsOnLengthBasis {
    public static void main(String[] args) {
        List<String> studentsList = getListOfStudents();
        Map<Integer, List<String>> groupedStudents = groupByLength(studentsList);

        for (Map.Entry<Integer, List<String>> entry : groupedStudents.entrySet()) {
            System.out.println("Length " + entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<Integer, List<String>> groupByLength(List<String> words) {
        Map<Integer, List<String>> result = new HashMap<>();

        for (String word : words) {
            int length = word.trim().length();
            result.computeIfAbsent(length, k -> new ArrayList<>()).add(word);
        }

        return result;
    }

    public static List<String> getListOfStudents() {
        List<String> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(",");

        for (String name : input) {
            studentList.add(name.trim());
        }

        return studentList;
    }
}

