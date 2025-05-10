
public class index {

    public static void main(String a[]) {

        int nums[][] = new int[6][4];
        nums[5][0] = 5;
        nums[1][0] = 2;
        nums[2][0] = 1;
        nums[3][0] = 3;
        nums[4][0] = 4;
        nums[0][0] = 9;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
