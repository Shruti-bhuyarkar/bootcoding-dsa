package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;
import java.util.Stack;
public class MyQueue {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        System.out.println("Front element: " + myQueue.peek()); // Output: 1
        System.out.println("Dequeue: " + myQueue.pop()); // Output: 1
        System.out.println("Is empty: " + myQueue.empty()); // Output: false
    }
    private Stack<Integer> pushStack;
    private Stack<Integer> popStack;

    /** Initialize your data structure here. */
    public MyQueue() {
        pushStack = new Stack<>();
        popStack = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        pushStack.push(x);
    }

    /** Removes the element from the front of queue and returns it. */
    public int pop() {
        // Ensure popStack is not empty before popping
        if (popStack.isEmpty()) {
            transferElements();
        }
        return popStack.pop();
    }

    /** Get the front element. */
    public int peek() {
        // Ensure popStack is not empty before peeking
        if (popStack.isEmpty()) {
            transferElements();
        }
        return popStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return pushStack.isEmpty() && popStack.isEmpty();
    }

    // Helper method to transfer elements from pushStack to popStack
    private void transferElements() {
        while (!pushStack.isEmpty()) {
            popStack.push(pushStack.pop());
        }
    }


}

