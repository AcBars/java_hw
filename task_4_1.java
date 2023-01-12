/*1. Пусть дан LinkedList с несколькими элементами.
Реализуйте метод, который вернет “перевернутый” список. */

public class task_4_1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);

        System.out.println("Original List: ");
        list.printList();

        LinkedList reversedList = list.reverse();
        System.out.println("\nReversed List: ");
        reversedList.printList();
    }
}

class LinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public LinkedList reverse() {
        LinkedList reversedList = new LinkedList();
        Node current = head;
        while (current != null) {
            reversedList.push(current.data);
            current = current.next;
        }
        return reversedList;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

