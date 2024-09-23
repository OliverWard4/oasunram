package osunram.Linear_Sort;

public class main {

    public static void main(String[] args) {

        // sorting example is differnt because it is more optimized
        int index;

        int[] nums = { 2, 2, 1, 3, 5, 7, 7, 89, 0, -2, 4, 23, 56, 1, 23, 45, 76, 4, 5, 23, 2, 46, 45, 6 };

        for (int i = 0; i < nums.length - 1; i++) {
            index = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[index]) {
                    index = j;
                }
            }
            int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
        }

        for (int x : nums) {
            System.out.print(x + ", ");
        }

    }
}
