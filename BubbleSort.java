
public class BubbleSort {

    public static void main(String[] args) {

        int nums[] = {17, 13, 15, 7, 19, 1, 3, 5};
        int temp = 0;

        System.out.println("Before sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        // Logic for bubble sort 
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    /* swapping without third variable
                     nums[j] = nums[j] + nums[j + 1];
                     nums[j + 1] = nums[j] - nums[j + 1];
                     nums[j] = nums[j] - nums[j + 1]; */
                }
            }
        }

        System.out.println("After sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
