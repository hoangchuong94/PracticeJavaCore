package datastructure.algorithms;

public class SinglyLinkedList {
    ListNode head;

    public static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.print("null");
    }

    public int length() {
        if(head == null){
            return 0;
        }
        int cout = 0;
        ListNode current = head;
        while(current != null){
            cout++;
            current = current.next;
        }return cout;
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.head = new ListNode(1);
        ListNode node2  = new ListNode(5);
        ListNode node3 = new ListNode(10);
        ListNode node4 = new ListNode(20);

        singlyLinkedList.head.next = node2;
        node2.next = node3;
        node3.next = node4;

        singlyLinkedList.display();
        System.out.println("do dai cua mang la :" + singlyLinkedList.length());
    }

}

