public class Merge_Sort_of_A_LinkedList {
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
    }

    static Node getMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    static Node getTail(Node head) {
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        return tail;
    }

    static LinkedList mergeTwoSortedList(LinkedList list1, LinkedList list2) {

        LinkedList result = new LinkedList();
        Node one = list1.head;
        Node two = list2.head;

        while (one != null && two != null) {
            if (one.val < two.val) {
                result.addLast(one.val);
                one = one.next;
            } else {
                result.addLast(two.val);
                two = two.next;
            }
        }

        while (one != null) {
            result.addLast(one.val);
            one = one.next;
        }

        while (two != null) {
            result.addLast(two.val);
            two = two.next;
        }

        return result;
    }

    public static LinkedList mergeSortOfList(Node headNode, Node tailNode) {

        if (headNode == tailNode) {
            LinkedList br = new LinkedList();
            br.addLast(headNode.val);
            return br;
        }

        Node midNode = getMid(headNode);
        Node midNext = midNode.next;
        midNode.next = null;

        LinkedList fsh = mergeSortOfList(headNode, midNode);
        LinkedList ssh = mergeSortOfList(midNext, tailNode);
        LinkedList cl = mergeTwoSortedList(fsh, ssh);

        return cl;
    }

    public static void main(String[] args) {

        // initilize and put value in list
        LinkedList list = new LinkedList();
        list.addLast(2);
        list.addLast(7);
        list.addLast(1);
        list.addLast(9);
        list.addLast(6);
        list.addLast(5);
        list.addLast(3);
        list.addLast(4);
        list.addLast(8);

        System.out.print("List Before List After Merge Sort : ");
        list.print();

        LinkedList finalList = mergeSortOfList(list.head, getTail(list.head));
        System.out.print("Final List After Merge Sort : ");
        finalList.print();

    }

}
