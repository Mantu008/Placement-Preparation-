public class Merge_Two_Sorted_Array {

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

    public static LinkedList mergeTwoSortedList(LinkedList list1, LinkedList list2) {

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

    public static void main(String[] args) {

        // initilize and put value in list1
        LinkedList list1 = new LinkedList();
        list1.addLast(10);
        list1.addLast(20);
        list1.addLast(30);
        list1.addLast(40);
        list1.addLast(50);
        System.out.print("List 1 : ");
        list1.print();

        // initilize and put value in list2
        LinkedList list2 = new LinkedList();
        list2.addLast(7);
        list2.addLast(9);
        list2.addLast(12);
        list2.addLast(15);
        list2.addLast(37);
        list2.addLast(43);
        list2.addLast(44);
        list2.addLast(45);
        list2.addLast(52);
        System.out.print("List 2 : ");
        list2.print();

        LinkedList finalList = mergeTwoSortedList(list1, list2);
        System.out.print("Final List After Merge two sorted list Sorting : ");
        finalList.print();

    }

}
