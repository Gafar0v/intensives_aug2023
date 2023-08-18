// Extra task https://leetcode.com/problems/valid-parentheses/

package ru.yandex.tasks;

import java.util.Stack;

public class Task6BraceBalance {
    public static boolean checkBalance(String sequence) {
        /*
         * sequence - последовательность скобок []{}() длины до 10^5
         * Выход: true/false, является ли строка ПСП
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        String[] braceList = sequence.split("");
        if (braceList.length == 0) return true;
        if (braceList[0].equals(")") || braceList[0].equals("}") || braceList[0].equals("]")) return false;
        Stack<String> braceStack = new Stack<>();

        for (String brace : braceList) {
            if (brace.equals("(") || brace.equals("{") || brace.equals("[")) {
                braceStack.push(brace);
            } else {
                if (brace.equals("}") && !braceStack.isEmpty() && braceStack.peek().equals("{")) {
                    braceStack.pop();
                } else if (brace.equals(")") && !braceStack.isEmpty() && braceStack.peek().equals("(")) {
                    braceStack.pop();
                } else if (brace.equals("]") && !braceStack.isEmpty() && braceStack.peek().equals("[")) {
                    braceStack.pop();
                } else return false;
            }
        }
        return braceStack.isEmpty();
    }

    public static void selfCheck() {
        String test1 = "[({})]{[]}";
        String test2 = "{({})}{";

        assert checkBalance(test1);
        assert !checkBalance(test2);
    }
}
