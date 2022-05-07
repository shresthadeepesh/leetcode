package com.techlink.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MostCommonWord {

    public static String mostCommonWord(String paragraph, String[] banned) {

        String filtered = paragraph.toLowerCase().replaceAll("[-+.^:,@#!$%&*(){}\\[\\]_\"'?;`]", " ");
        List<String> filteredToArray = new ArrayList<>(List.of(filtered.split("\\s")));

        filteredToArray.removeAll(Collections.singleton(""));

        for(String c: banned) {
            filteredToArray.removeAll(Collections.singleton(c));
        }

        String common = filteredToArray.get(0);

        int greatest = 0;
        for(String c: filteredToArray) {
            int total = 0;
            for(String d: filteredToArray) {
                if(d.equals(c)) {
                    total++;
                }
            }

            if(total > greatest) {
                greatest = total;
                common = c;
            }
        }

        return common;
    }

    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};

        System.out.println(mostCommonWord(paragraph, banned));

        String paragraph1 = "a, a, a, a, b,b,b,c, c";
        String[] banned1 = {"a"};

        System.out.println(mostCommonWord(paragraph1, banned1));
    }

}
