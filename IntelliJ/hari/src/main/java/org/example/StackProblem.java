package org.example;
import java.util.*;

public class StackProblem {
    public static void balancedParantheses(String str){
        Stack<Character> stack=new Stack<>();
        char[] chr=str.toCharArray();
        System.out.println(Arrays.toString(chr));
        int count=0;
        for(char i:chr){
            if(i=='('){
                stack.push(i);
            }
            else{
                if(!stack.empty()){
                    stack.pop();
                }
                else{
                    count++;
                }
            }
        }
        System.out.println(stack.size()+count);

    }    public static void main(String[] args) {
        balancedParantheses("))((");

    }
}
