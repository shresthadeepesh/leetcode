package com.techlink.leetcode;

public class JewelsStones {

    public static int numJewelsInStones(String jewels, String stones) {
        int result = 0;

        for(char c: jewels.toCharArray()) {
            for(char j: stones.toCharArray()) {
                if(c == j) {
                    result++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(numJewelsInStones("z", "ZZ"));
    }

}
