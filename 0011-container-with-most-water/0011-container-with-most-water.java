class Solution {
    public int maxArea(int[] height) {
        int n = height.length;

        int ans=-1;

        int i=0,j=n-1;

        while(i<j){
            int area = (j-i)*(Math.min(height[i],height[j]));
            ans = Math.max(area,ans);
            if(height[i]<height[j])
                i++;
            else
                j--;
        }

        return ans;
    }
}