public class Find_Kth_Element_From_End {
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

        int kthElementFromEnd(int k) {
            Node slow = head;
            Node fast = head;

            // move fast pointer to given k length
            for (int i = 0; i < k; i++) {
                fast = fast.next;
            }

            // move slow and fast whenever the fast is not null

            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }

            // so here the slow pointer is my kth element from end return it

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

        // kth element from end of LinkedList

        System.out.println("Kth ELement From End : " + linkedList.kthElementFromEnd(2));
    }
}
