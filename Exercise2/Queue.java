/**
 * Name Surname : Furkan Bozkurt
 * Date: 16.11.2026
 */
package Exercise2;

public class Queue {
    private Node front;
    private Node rear;
    private int size;

    public Queue() {
        front = null;
        rear = null;
        size = 0;
    }

    //Add a customer to the queue
    public void enqueue(String customerName) {

        Node newNode = new Node(customerName);

        if (front == null) {
            front = newNode;
            rear = newNode;
        }
        else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
    }

    //Remove the first customer
    public String dequeue() {

        if (isEmpty()) {
            return null;
        }

        String name = front.customerName;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        size--;

        return name;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }

    //Display the waiting customers
    public void display() {

        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }

        Node current = front;

        while (current != null) {
            System.out.print(current.customerName);

            if (current.next != null) {
                System.out.print(" -> ");
            }

            current = current.next;
        }

        System.out.println();
    }
}
