package com.techlink.leetcode;

public class RobotOrigin {

    public static boolean judgeCircle(String moves) {
        int x = 0, y = 0;

        for(char c: moves.toUpperCase().toCharArray()) {
            if(c == 'U') {
                y++;
            } else if(c == 'D') {
                y--;
            } else if( c == 'L') {
                x++;
            } else if (c == 'R') {
                x--;
            }
        }

        return x == 0 && y == 0;
    }

    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));
        System.out.println(judgeCircle("LL" ));
    }

}
