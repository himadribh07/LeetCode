class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();

        for(int i=0;i<n;i++){
            Map<Integer,Integer> map = new HashMap<>();
            for(int j=i+1;j<n;j++){
                int diff = -(nums[i]+nums[j]);
                if(map.containsKey(diff)){
                    List<Integer> temp= Arrays.asList(diff, nums[i], nums[j]);
                    Collections.sort(temp);
                    set.add(temp);
                }

                map.put(nums[j],j);

            } 
        }

        return new ArrayList<>(set);
    }
}