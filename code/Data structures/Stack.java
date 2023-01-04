/*A stack is a linear data structure that follows the last-in, first-out (LIFO) principle.
 This means that the last element added to the stack will be the first one to be removed. 
 */

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements to the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Print the top element of the stack
        System.out.println(stack.peek());  // Output: 3

        // Pop the top element of the stack
        stack.pop();

        // Print the top element of the stack again
        System.out.println(stack.peek());  // Output: 2
    }
}
