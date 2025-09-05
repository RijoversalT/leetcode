class Solution {
    public int myAtoi(String s) {
         int index = 0;
        int sign = 1;
        int result = 0;
        int n = s.length();

        // 1. Discard leading whitespace
        while (index < n && s.charAt(index) == ' ') {
            index++;
        }

        // 2. Handle sign
        if (index < n && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }

        // 3. Read digits until non-digit or end of string
        while (index < n && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';

            // 4. Check for overflow before multiplying
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }

        return sign * result;
    }
}