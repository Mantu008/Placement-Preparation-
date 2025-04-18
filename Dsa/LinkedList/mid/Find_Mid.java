public class Find_Mid {
    public static class Node {
        int val;
        Node next;
    }

    public static class LinkedList {
        public Node head;

        void addLast(int data) {
            Node newNode = new Node();
            newNode.val = data;
            newNode.next = null;
            if (head == null) {
                head = newNode;
            } else {
                Node tempNode = head;
                while (tempNode.next != null) {
                    tempNode = tempNode.next;
                }
                tempNode.next = newNode;
            }
        }

        void print() {
            if (head == null) {
                System.out.println("LinkedList is Empty");
                return;
            }
            Node tempNode = head;
            while (tempNode != null) {
                System.out.print(tempNode.val + " ");
                tempNode = tempNode.next;
            }
            System.out.println();
        }

        int getMid() {
            Node slow = head;
            Node fast = head;
            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow.val;
        }

    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(5);

        linkedList.print();

        // Mid element from of LinkedList

        System.out.println("Mid Element From the Given LinkedList id : " + linkedList.getMid());
    }
}
