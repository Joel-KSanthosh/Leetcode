public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3){
            return false;
        }
        int i = Integer.MAX_VALUE, j = Integer.MAX_VALUE;
        for(int num : nums){
            if(num <= i){
                i = num;
            }
            else if(num <= j){
                j = num;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
