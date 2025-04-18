public class ImplementLinkedList {
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

        void addFirst(int data) {
            Node newNode = new Node();
            newNode.val = data;
            newNode.next = head;
            head = newNode;
        }

        void addAtIndex(int idx, int data) {

            // if we want to add at start index
            if (idx == 0) {
                addFirst(data);
                return;
            }

            // if we want to add at last index
            int size = 0;
            Node temp = head;
            while (temp != null) {
                size++;
                temp = temp.next;
            }
            if (idx == size) {
                addLast(data);
                return;
            }

            if (idx < 0 || idx > size) {
                System.out.println("Invalid Argumant");
                return;
            }

            Node tempNode = head;
            for (int i = 1; i < idx; i++) {
                tempNode = tempNode.next;
            }

            Node newNode = new Node();
            newNode.val = data;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
        }

        int getAtIndex(int idx) {
            if (idx < 0) {
                System.out.println("Invalid Argument: Index cannot be negative");
                return -1;
            }

            if (head == null) {
                System.out.println("List Is Empty");
                return -1;
            }

            Node tempNode = head;
            int currentIndex = 0;

            while (tempNode != null) {
                if (currentIndex == idx) {
                    return tempNode.val;
                }
                currentIndex++;
                tempNode = tempNode.next;
            }

            System.out.println("Invalid Argument: Index out of bounds");
            return -1;
        }

        int getFirst() {
            if (head == null) {
                System.out.println("List Is Empty");
                return -1;
            }

            return head.val;
        }

        int getLast() {
            if (head == null) {
                System.out.println("List Is Empty");
                return -1;
            }
            Node tempNode = head;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            return tempNode.val;
        }

        void removeFirst() {
            if (head == null) {
                System.out.println("LinkedList Is Empty");
            } else {
                head = head.next;
            }
        }

        void removeLast() {
            if (head == null) {
                System.out.println("LinkedList Is Empty");
                return;
            } else if (head.next == null) {
                head = null;
            } else {
                Node tempNode = head;
                while (tempNode.next.next != null) {
                    tempNode = tempNode.next;
                }
                tempNode.next = null;
            }
        }

        void removeAtIndex(int idx) {
            if (head == null) {
                System.out.println("List is EMpty..");
                return;
            }

            if (head != null && head.next == null) {
                head = null;
            }

            int size = 0;
            Node tempNode = head;
            while (tempNode != null) {
                size++;
                tempNode = tempNode.next;
            }

            if (idx == 0) {
                removeFirst();
            } else if (idx == size - 1) {
                removeLast();
            } else if (idx < 0 || idx >= size) {
                System.out.println("Invalid Range of Given Index");
            } else {
                Node temp = head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
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

        int size() {
            Node tempNode = head;
            int size = 0;
            while (tempNode != null) {
                size++;
                tempNode = tempNode.next;
            }
            return size;
        }

        void head() {
            if (head != null) {
                System.out.println("Head Value is : " + head.val);
            } else {
                System.out.println("LinkedList is Empty");
            }
        }

        private Node getNodeAt(int idx) {
            Node tempNode = head;
            for (int i = 0; i < idx; i++) {
                tempNode = tempNode.next;
            }
            return tempNode;
        }

        void reverceItrative() {
            int size = 0;
            Node temp = head;
            while (temp != null) {
                size++;
                temp = temp.next;
            }
            int li = 0;
            int ri = size - 1;

            while (li < ri) {
                Node left = getNodeAt(li);
                Node right = getNodeAt(ri);
                int tempVal = left.val;
                left.val = right.val;
                right.val = tempVal;
                li++;
                ri--;
            }
        }

        void revercePointerIterative() {
            Node prev = null;
            Node curr = head;
            while (curr != null) {
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }

    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.print();
        System.out.println("Size of the LinkedList is " + linkedList.size());
        linkedList.addFirst(12);
        linkedList.addFirst(45);
        linkedList.addLast(5);
        linkedList.print();
        System.out.println("Size of the LinkedList is " + linkedList.size());
        linkedList.head();
        System.out.println("Value At given Index is : " + linkedList.getAtIndex(0));
        System.out.println("Value At First Index is : " + linkedList.getFirst());
        System.out.println("Value At Last Index is : " + linkedList.getLast());
        linkedList.addAtIndex(2, 67);
        linkedList.print();
        System.out.println("Size of the LinkedList is " + linkedList.size());

        // reverce the LinkedList
        linkedList.reverceItrative();
        System.out.println("LinkedList After reverce Useing ittrative");
        linkedList.print();
        linkedList.revercePointerIterative();
        System.out.println("LinkedList After reverce using Pointer Iterative");
        linkedList.print();

        // remove at index
        System.out.println("Remove Element From LinkedList");
        linkedList.removeFirst();
        linkedList.print();
        System.out.println("Size of the LinkedList is " + linkedList.size());
        linkedList.removeLast();
        linkedList.print();
        System.out.println("Size of the LinkedList is " + linkedList.size());
        linkedList.removeAtIndex(2);
        linkedList.print();

    }
}