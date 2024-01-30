package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

import java.util.Stack;

public class EvaluateRPN {
    public static void main(String[] args) {
        EvaluateRPN evaluator = new EvaluateRPN();
        String[] tokens = {"2", "1", "+", "3", "*"};
        int result = evaluator.evalRPN(tokens);
        System.out.println("Result: " + result); // Output: 9
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = performOperation(operand1, operand2, token);
                stack.push(result);
            } else {
                // If the token is an operand, convert it to an integer and push it onto the stack
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private int performOperation(int operand1, int operand2, String operator) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }


}
