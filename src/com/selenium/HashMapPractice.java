package com.selenium;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        Map<Character,Integer> m=new HashMap();
        m.put('d',1);
        m.put('h',2);
        m.put('a',3);
        m.put('n',5);
        m.put('c',5);
        System.out.print(m.entrySet());
        System.out.println(m.get('a'));
        System.out.println(m.keySet());
        System.out.println(m.values());
    }
}
