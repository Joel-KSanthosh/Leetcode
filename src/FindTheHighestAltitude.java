public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int len = gain.length;
        int[] pre = new int[len];

        pre[0] = gain[0];
        int max = pre[0];
        for(int i = 1 ;i<len;i++){
            pre[i] = pre[i-1]+gain[i];
            max = Math.max(max,pre[i]);
        }
        if(max<0){
            max = 0;
        }
        return max;
    }
}
