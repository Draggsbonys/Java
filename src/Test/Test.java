package Test;
public class Test {
    public int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        OUTER:
        for (int i = 0; i < nums.length; i++) {
            INNER:
            for (int j = i; j < nums.length; j++) {

                if (nums[i]+nums[j] == target) {
                    if (j == i) {
                        continue INNER;
                    }
                    array[0] = i;
                    array[1] = j;
                }
            }
        }
        return array;
    }
}
