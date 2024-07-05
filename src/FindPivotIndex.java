public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        int[] pre = new int[len];
        int[] suf = new int[len];

        pre[0] = 0;
        suf[len-1] = 0;

        int i = 1, j = len - 2;
        while(i<len && j>=0){
            pre[i] = pre[i-1]+nums[i-1];
            suf[j] = suf[j+1]+nums[j+1];
            i++;
            j--;
        }

        for(i = 0 ;i< len ; i++){
            if(suf[i]==pre[i]){
                return i;
            }
        }
        return -1;


    }
}
