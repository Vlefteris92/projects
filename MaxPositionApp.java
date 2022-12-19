package gr.aueb.cf.projects;

public class MaxPositionApp {
    public static void main(String[] args) {
        int[] arr = {1, 7, 9, 2, 5 };
        int maxPos;

        maxPos = getMaxPosition(arr, 0, arr.length -1);
        if (maxPos == -1) System.exit(1);
        System.out.println(arr[maxPos]);
    }

    public static int getMaxPosition(int[] arr, int low, int high) {
        int maxPosition = 0;
        int maxValue = arr[low];

        if ((arr == null) || (arr.length < 1)) return -1;
        if ((low < 0) || (high > arr.length - 1) || (low > high)) {
            return -1;
        }

        for (int i = low + 1; i <= high; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }

        return maxPosition;
    }

}
