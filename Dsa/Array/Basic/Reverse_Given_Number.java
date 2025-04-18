public class Reverse_Given_Number {
    public static void main(String[] args) {
        int n = 123;
        String s = String.valueOf(n);
        char[] charArray = s.toCharArray();
        int i = 0;
        int j = charArray.length - 1;
        while (i <= j) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }
        int revNumber = Integer.parseInt(new String(charArray));
        System.out.println("Reverse Number :" + revNumber);
    }
}
