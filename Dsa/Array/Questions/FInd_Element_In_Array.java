public class FInd_Element_In_Array {
  public static void main(String[] args) {
    // Input: arr = [3, 8, 4, 1, 9], target = 4
    // Output: Found at index 2

    int[] arr = { 3, 8, 4, 1, 9 };
    int target = 4;
    int elementIndex = findElement(arr, target);
    System.out.println("Element FOund At Index:-" + elementIndex);
  }

  public static int findElement(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        return i;
      }
    }
    return -1;
  }
}