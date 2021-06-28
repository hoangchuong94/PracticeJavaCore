package datastructure.algorithms;

public class LinkedLists {
    static class Node<E> {
        E element; Node<E> next;
        public Node(E e) {
            element = e;
        }
    }

    public static void main(String[] args) {
        Node<String> head = null;
        Node<String> tail = null;
        head = new Node<>("CHICAGO");
        tail = head;
        tail.next = new Node<>("DENVER");
        tail = tail.next;
    }
}
