package com.techlink.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Anagram {

    public static boolean isAnagram(String s, String t) {
        List<Character> list = new ArrayList<>();

        for(char a: s.toCharArray()) {
            list.add(a);
        }

        for(char b: t.toCharArray()) {
            if(list.contains(b)) {
                list.remove(list.get(b));
            }

            return false;
        }

        return list.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

}
