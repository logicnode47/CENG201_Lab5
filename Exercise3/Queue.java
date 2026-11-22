/**
 * Name Surname : Furkan Bozkurt
 * Date: 16.11.2026
 */
package Exercise3;

public class Queue {
    private char[] items;
    private int front;
    private int rear;
    private int count;

    public Queue(int capacity) {
        items = new char[capacity];
        front = 0;
        rear = -1;
        count = 0;
    }

    //Add a character to the queue
    public void enqueue(char value) {

        if (isFull()) {
            return;
        }

        rear = (rear + 1) % items.length;
        items[rear] = value;
        count++;
    }

    //Remove the first character
    public char dequeue() {

        if (isEmpty()) {
            return '\0';
        }

        char value = items[front];
        front = (front + 1) % items.length;
        count--;

        return value;
    }

    //Return the first character
    public char peek() {

        if (isEmpty()) {
            return '\0';
        }

        return items[front];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == items.length;
    }

    public int size() {
        return count;
    }
}
