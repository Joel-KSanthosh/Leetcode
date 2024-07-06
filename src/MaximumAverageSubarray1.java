public class MaximumAverageSubarray1 {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length<2){
            return (double) nums[0];
        }

        int sum = 0;
        int max = 0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        max = sum;

        int end = k;
        int start = 0;


        while(end<nums.length){
            sum-= nums[start];
            start++;

            sum+=nums[end];
            end++;


            max = Math.max(sum,max);
        }

        return (double)max/k;
    }
}
