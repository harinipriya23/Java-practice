
public class InsertionSort {

    public static void main(String[] args) {
        int nums[] = {21, 5, 3, 9, 2, 19, 17, 15};
        int length = nums.length;

        for (int i = 1; i < length; i++) {

            int temp = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > temp) {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j + 1] = temp;
        }
        System.out.println("After sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

}
