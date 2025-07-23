class Solution {
    public int maximumGain(String s, int x, int y) {
        int score = 0;
        if (x > y) {
            score = calculateScore(s, "ab", x, "ba", y);
        } else {
            score = calculateScore(s, "ba", y, "ab", x);
        }
        return score;
    }

    private int calculateScore(String s, String first, int firstVal, String second, int secondVal) {
        int score = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(c);
            while (sb.length() >= 2 && sb.substring(sb.length() - 2).equals(first)) {
                sb.delete(sb.length() - 2, sb.length());
                score += firstVal;
            }
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (!stack.isEmpty() && (stack.peek() == second.charAt(0) && c == second.charAt(1))) {
                stack.pop();
                score += secondVal;
            } else {
                stack.push(c);
            }
        }

        return score;
    }
}