public class StrobogrammaticNumber {

    public static boolean isStrobogrammatic(String num) {
        int left = 0;
        int right = num.length() - 1;

        while (left <= right) {
            char leftChar = num.charAt(left);
            char rightChar = num.charAt(right);

            if (!isValidStrobogrammaticPair(leftChar, rightChar)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    private static boolean isValidStrobogrammaticPair(char leftChar, char rightChar) {
        return (leftChar == '0' && rightChar == '0') ||
               (leftChar == '1' && rightChar == '1') ||
               (leftChar == '8' && rightChar == '8') ||
               (leftChar == '6' && rightChar == '9') ||
               (leftChar == '9' && rightChar == '6');
    }

    public static void main(String[] args) {
        String num = "11";
        if (isStrobogrammatic(num)) {
            System.out.println(num + " is strobogrammatic.");
        } else {
            System.out.println(num + " is not strobogrammatic.");
        }
    }
}
