package Test4;
import java.math.BigInteger;
import java.util.List;
import java.util.ArrayList;
public class Task {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();

        StringBuilder container = new StringBuilder();
        for (int i = 0; i < num.length; i++) {
            container.append(num[i]);
        }
        String numberString = container.toString();
        BigInteger numberInt = new BigInteger(numberString);
        BigInteger numberK = new BigInteger(String.valueOf(k));
        BigInteger numberInteger = numberInt.add(numberK);

        StringBuilder finalContainer = new StringBuilder();
        numberString = numberInteger.toString();

        finalContainer.append(numberString);
        System.out.println(finalContainer);

        for (int i = 0; i < finalContainer.length(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(finalContainer.charAt(i));
            String str = sb.toString();
            int num1 = Integer.parseInt(str);
            list.add(i, num1);
        }
        return list;
    }
}
