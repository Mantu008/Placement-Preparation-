public class Remove_Duplicate_From_Sorted_List {

    public static class Node {
        int val;
        Node next;
    }

    public static class LinkedList {
        public Node head;
        public Node tail;

        void addLast(int data) {
            Node newNode = new Node();
            newNode.val = data;
            newNode.next = null;
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
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

    static LinkedList removeDuplicateFromSortedList(LinkedList list) {

        LinkedList result = new LinkedList();
        Node tempHeadNode = list.head;
        while (tempHeadNode != null) {
            if (result.tail == null || result.tail.val != tempHeadNode.val) {
                result.addLast(tempHeadNode.val);
            }
            tempHeadNode = tempHeadNode.next;
        }

        return result;

    }

    static void removeDuplicateFromSortedListWithoutTail(LinkedList list) {

        // no need to create new list modify previous list
        Node currentNode = list.head;
        while (currentNode != null && currentNode.next != null) {
            if (currentNode.val == currentNode.next.val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }

    }

    public static void main(String[] args) {
        // initilize and put value in list2
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(3);
        list.addLast(3);
        list.addLast(4);
        list.addLast(4);
        list.addLast(5);
        list.addLast(5);
        list.addLast(5);
        list.addLast(5);
        list.addLast(6);

        System.out.print("List  : ");
        list.print();

        LinkedList finalList = removeDuplicateFromSortedList(list);
        System.out.print("Final List After Remove Duplicate From Sorted List : ");
        finalList.print();

        System.out.println("remove duplicate without tail and not return new list here modify given origonal list");
        removeDuplicateFromSortedListWithoutTail(list);
        System.out.print("Final List After Remove Duplicate From Sorted List : ");
        list.print();
    }
}