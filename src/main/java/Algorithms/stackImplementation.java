package Algorithms;

import java.util.Stack;

public class stackImplementation {
    //Stack follows LIFO (Last In first out)
    //Pushing a Element to top of Stack
    static void stack_push(Stack<Integer> stack) {
        for(int i=0;i <5 ;i++) {
            stack.push(i);
        }
    }

    //Popping an element from Top of Stack
    static void stack_pop(Stack<Integer> stack) {
        for(int i=0;i<5;i++) {
            stack.pop();
        }
    }

    //Displaying element on the top of Stack
    static void stack_peek(Stack<Integer> stack){
        Integer element = stack.peek();
    }

    //Searching for the element in Stack
    static void stack_search(Stack<Integer> stack,int element){
        Integer positionOfStack = stack.search(element);
        if(positionOfStack == -1) {
            System.out.println("Element Not Found");
        } else {
            System.out.println("Element is found at location" + positionOfStack);
        }

    }

    public static void main (String[] args) {
        Stack <Integer> stack = new Stack<Integer>();
        stack_push(stack);
        stack_pop(stack);
        stack_push(stack);
        stack_peek(stack);
        stack_search(stack, 2);
        stack_search(stack, 6);
    }
}
