class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set = new HashSet<>();

        for(int i:nums){
            set.add(i);
        }
        int ans = 0;

        for(int i:set){
            if(!set.contains(i-1)){
                int x = i;
                int count =1;
                while(set.contains(x+1)){
                    count++;
                    x++;
                }
                
                ans=Math.max(count,ans);
            }
        }

        return ans;
    }
}