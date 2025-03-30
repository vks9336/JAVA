package com.Stacks_in_JAVA.Stack_Questions;

import java.util.Stack;

public class ValidParenthesis {
    //valid parenthesis method
    public static boolean check(String parenthesis){
        if(parenthesis.isEmpty()) return false;

        Stack<Character> st = new Stack<>();

        for(char ch : parenthesis.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else if(st.peek() == '(' && ch == ')'){
                st.pop();
            } else if(st.peek() == '{' && ch == '}') {
                st.pop();
            }
            else if(st.peek() == '[' && ch == ']'){
                st.pop();
            }
            if(st.isEmpty() && ch == ')' || ch == '}' || ch == ']'){
                return false;
            }
        }

        return st.isEmpty();
    }

    //main method
    public static void main(String[] args) {
        String parenthesis = "()()()()";

        boolean ans = check(parenthesis);

        if(ans){
            System.out.println("It is valid !!");
        }
        else{
            System.out.println("It is not valid !!");
        }
    }
}
