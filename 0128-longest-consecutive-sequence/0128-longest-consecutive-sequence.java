class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int longest = 1;

        if(n == 0) return 0;
        Set<Integer> set = new HashSet<>();

        //Fill the set with array elements
        for(int num : nums){
            set.add(num);
        }

        //Iterate in the set
        for(int num : set){
            //Start count for element x if there is no smaller element that the current element
            if(!set.contains(num-1)){
                int count = 1;
                int x = num;
            
            //While the next consecutive element is available count++ and element + 1
            while(set.contains(x+1)){
                x += 1;
                count += 1;
            }
            

            //Compare the longest and count and assign whichever is greater
            longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}