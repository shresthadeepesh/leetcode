package com.techlink.leetcode;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else if(stack.peek() == '(' && s.charAt(i) == ')') {
                stack.pop();
            } else if(stack.peek() == '{' && s.charAt(i) == '}') {
                stack.pop();
            } else if(stack.peek() == '[' && s.charAt(i) == ']') {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String s = "()[]{}[";

        System.out.println(isValid(s));

    }

}
