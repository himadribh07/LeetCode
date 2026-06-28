class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int [] ans= new int[2];
        for(int i=0;i<n;i++){
            int diff = target - numbers[i];
            int start = i+1;
            int end = n-1;

            while(start<=end){
                int mid = (start+end)/2;

                if(numbers[mid]==diff){
                    ans[0]=i+1;
                    ans[1]=mid+1;
                    return ans;
                }

                else if(numbers[mid]>diff)
                    end = mid-1;
                else
                    start=mid+1;
            }
        }
        return new int []{-1,-1};
    }
}