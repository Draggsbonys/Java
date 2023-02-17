package Test;

public class Main {
    public static void main(String[] args) {
        int[] sum = new int[] {3,2,4}; // {2,7,11,15} {3,2,4} {3,3} {3,2,3}
        Test test = new Test();

        for (int i = 0; i < test.twoSum(sum, 6).length; i++) {
            System.out.println(test.twoSum(sum, 6)[i]);
        }

    }
}
