public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int i = 1;
        int j = 0;

        while(j<i && i<nums.length){
            if(nums[j]==0 && nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
                i++;
            }
            else if(nums[j]==0){
                i++;
            }
            else{
                i++;
                j++;
            }
        }
        System.out.println(nums);

    }
}
