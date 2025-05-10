

/* public class dsa {

    public static void main(String a[]) {

        int nums[] = {10, 11, 12, 19, 31, 73};
        int target = 10;

        int result = linearSearch(nums, target);

        if (result != -1) {
            System.out.println("The target is fount at the index of " + result);
        } else {
            System.out.println("Target not found!");
        }

    }

    public static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            }
        }
        return -1;
    }
}
 */
public class dsa {

    public static void main(String a[]) {

        int nums[] = {1, 2, 3, 4, 5, 6, 8, 9, 13, 15, 17};
        int target = 4;

        int result = binarySearch(nums, target);

        System.out.println("Result from binary search " + result);
    }

    public static int binarySearch(int nums[], int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
            // recursive method is also there where left, right, is passed from result also binarysearch is called else if and else during change in mid point 
        }
        return -1;
    }
}
