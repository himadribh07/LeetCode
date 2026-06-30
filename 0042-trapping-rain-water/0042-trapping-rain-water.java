class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int [] leftmax = getLeftMax(height,n);
        int [] rightmax = getRightMax(height,n);

        int sum=0;
        for(int i=0;i<n;i++){
            int h = Math.min(leftmax[i],rightmax[i]) - height[i];

            sum+=h;
        }

        return sum;
    }

    int [] getLeftMax(int [] h, int n){
        int [] left = new int[n];

        left[0]=h[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],h[i]);
        }

        return left;
    }

    int [] getRightMax(int [] h, int n){
        int [] right = new int[n];

        right[n-1]=h[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],h[i]);
        }

        return right;
    }
}