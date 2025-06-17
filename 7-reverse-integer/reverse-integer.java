class Solution {
    public int reverse(int x) {
        String s = Integer.toString(x);
        long y = 0;  // changed to long to avoid overflow

        if (s.charAt(0) == '-') {
            String newString = "-";
            for (int i = s.length() - 1; i > 0; i--) {
                char ch = s.charAt(i);
                newString += ch;
            }
            y = Long.parseLong(newString);  // use Long.parseLong
        } else {
            String newString = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                char ch = s.charAt(i);
                newString += ch;
            }

            int idx = 0;
            for (int i = 0; i < newString.length(); i++) {
                if (newString.charAt(i) != '0') {
                    idx = i;
                    break;
                }
            }

            String newString1 = "";
            for (int i = idx; i < newString.length(); i++) {
                newString1 += newString.charAt(i);
            }

            y = Long.parseLong(newString1);  // use Long.parseLong
        }

        // Check for 32-bit integer overflow
        if (y < Integer.MIN_VALUE || y > Integer.MAX_VALUE) {
            return 0;
        }

        return (int) y;
    }
}
