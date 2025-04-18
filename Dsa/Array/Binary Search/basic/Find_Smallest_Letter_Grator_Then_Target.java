public class Find_Smallest_Letter_Grator_Then_Target {
    public static void main(String[] args) {
        char arr[] = { 'c', 'f', 'j' };
        char target = 'a';

        char smallertLetter = findSmallestLettr(arr, target);
        System.out.println("Smallet Letter Gratter Then Target is :" + smallertLetter);
    }

    public static char findSmallestLettr(char arr[], char target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start);
            if (target == arr[mid]) {
                return arr[mid];
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start % arr.length];
    }
}
