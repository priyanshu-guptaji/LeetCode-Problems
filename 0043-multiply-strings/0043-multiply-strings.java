class Solution {
    public String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0"))
            return "0";

        int len1 = num1.length();
        int len2 = num2.length();

        int[] arr = new int[len1 + len2];

        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {

                int mult = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');

                int p1 = i + j;
                int p2 = i + j + 1;

                int sum = mult + arr[p2];

                arr[p2] = sum % 10;
                arr[p1] += sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int num : arr) {
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}