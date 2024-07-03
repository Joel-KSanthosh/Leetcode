public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int i = 1;
        int len = nums.length;
        int j = len-2;

        int[] pre = new int[len];
        int[] suf = new int[len];
        int[] res = new int[len];
        pre[0] = 1;
        suf[len-1] = 1;

        while(i<len && j>=0){
            pre[i] = pre[i-1] * nums[i-1];
            suf[j] = suf[j+1] * nums[j+1];
            i++;
            j--;
        }

        for(i=0;i<len;i++){
            res[i] = pre[i] * suf[i];
        }
        return res;
    }
}
