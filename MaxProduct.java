public class MaxProduct {
    private  static int maxProductSubArray(int[] nums){
        int pre = 1;
        int suf = 1;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(pre==0) pre=1;
            if(suf==0) suf=1;
            pre = pre * nums[i];
            suf = suf * nums[nums.length-i-1];
            ans = Math.max(ans,Math.max(pre,suf));
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,-3,0,-4,-5};
        int answer = maxProductSubArray(nums);
        System.out.print("The maximum product subarray is: "+answer);
    }
}
