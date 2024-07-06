public class PassThePillow {
    public int passThePillow(int n, int time) {
        int direction = 1;
        int i = 2;
        while(i<n+1){
            time--;
            if(time==0){
                break;
            }

            if(i==n || i==1){
                direction*=-1;
            }

            if(direction==-1){
                i--;
            }
            else{
                i++;
            }
        }
        return i;
    }
}
