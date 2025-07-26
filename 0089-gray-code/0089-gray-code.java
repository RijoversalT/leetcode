class Solution {
    public List<Integer> grayCode(int n) {
         List<Integer> result = new ArrayList<>();
        result.add(0);
        if (n == 0) {
            return result;
        }

        for (int i = 0; i < n; i++) {
            int size = result.size();
            for (int j = size - 1; j >= 0; j--) {
                result.add(result.get(j) | (1 << i));
            }
        }

        return result;
    }
}