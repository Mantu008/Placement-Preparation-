public class rain_Water_Harwasting {
    public static void main(String[] args) {

        int arr[] = { 3, 0, 0, 2, 0, 4 };
        int rainWaterHarvasting = findRainWaterHarvasting(arr);
        System.out.println("The Total Water Harvasting Value is :" + rainWaterHarvasting);
    }

    public static int findRainWaterHarvasting(int arr[]) {
        int ngr[] = new int[arr.length];
        int ngl[] = new int[arr.length];
        findNextGratorToRight(arr, ngr);
        findNextGratorToLeft(arr, ngl);

        int water[] = new int[arr.length];
        findWater(water, ngr, ngl, arr);

        int sum = 0;
        for (int val : water) {
            sum += val;
        }

        return sum;
    }

    public static void findWater(int water[], int ngr[], int ngl[], int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            water[i] = Integer.min(ngr[i], ngl[i]) - arr[i];
        }
    }

    public static void findNextGratorToRight(int arr[], int ngr[]) {
        ngr[arr.length - 1] = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            ngr[i] = Math.max(ngr[i + 1], arr[i]);
        }

    }

    public static void findNextGratorToLeft(int arr[], int ngl[]) {
        ngl[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ngl[i] = Math.max(ngl[i - 1], arr[i]);
        }
    }
}
