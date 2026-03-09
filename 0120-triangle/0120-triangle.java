class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<Integer> lastRow = triangle.getLast();
        List<Integer> minValues = new ArrayList<>(lastRow);
        for (int i = triangle.size() -2; i >= 0; i--) {
            List<Integer> row = triangle.get(i);
            for(int j = 0; j < row.size(); j++){
                minValues.set(j,  Math.min(minValues.get(j), minValues.get(j+1)) + row.get(j));
            }
        }
        return minValues.getFirst();
    }
}