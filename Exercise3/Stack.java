/**
 * Name Surname : Furkan Bozkurt
 * Date: 16.11.2026
 */
package Exercise3;

public class Stack {
    private char[] items;
    private int top;

    public Stack(int capacity) {
        items = new char[capacity];
        top = -1;
    }

    //Add a character to the stack
    public void push(char value) {

        if (isFull()) {
            return;
        }

        top++;
        items[top] = value;
    }

    //Remove the top character
    public char pop() {

        if (isEmpty()) {
            return '\0';
        }
        char value = items[top];
        top--;
        return value;
    }

    //Return the top character
    public char peek() {

        if (isEmpty()) {
            return '\0';
        }

        return items[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == items.length - 1;
    }
}
