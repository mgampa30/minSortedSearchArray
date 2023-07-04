class FindMinimumElement {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int minElement = findMinimum(arr);
        System.out.println("Minimum element: " + minElement);
    }

    public static int findMinimum(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] <= arr[right]) {
                return arr[left];
            }

            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return arr[left];
    }
}
