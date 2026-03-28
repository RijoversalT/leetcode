class Solution {
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for (int ele : nums) {
            ones = (ones ^ ele) & (~twos);
            twos = (twos ^ ele) & (~ones);
        }
        return ones;
    }
}