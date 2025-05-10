
public class InsertionSort {

    public static void main(String[] args) {
        int nums[] = {21, 5, 3, 9, 2, 19, 17, 15};
        int length = nums.length;

        for (int i = 0; i < length - 1; i++) {

            int minValueIndex = i;
            int temp = 0;

            for (int j = i + 1; j < length - 1; j++) {
                if (nums[minValueIndex] < nums[j]) {
                    minValueIndex = j;
                }
            }

            temp = nums[minValueIndex];
            nums[minValueIndex] = nums[i];
            nums[i] = temp;
            System.out.println("");
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }
        System.out.println("After sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

}
