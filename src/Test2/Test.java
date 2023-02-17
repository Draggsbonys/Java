package Test2;

public class Test {
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder();
        boolean b = false;
        sb.append(x);
        OUTER:
        for (int i = 0; i < sb.length(); i++) {
            INNER:
            for (int j = sb.length()-(i+1); j >= i; j--) {
                if (sb.charAt(i) == sb.charAt(j)) {
                    b = true;
                    break INNER;
                } else {
                    b = false;
                    break OUTER;
                }
            }
        }
        return b;
    }
}
