public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;

        if(flowerbed.length==1 && flowerbed[0] == 0){
            n--;
            return true;
        }
        if(n==0){
            return true;
        }
        while(i<flowerbed.length && flowerbed.length>1){
            if(i==0){
                if(flowerbed[i] == 0 && flowerbed[i+1] == 0){
                    flowerbed[i]=1;
                    n--;
                }
            }
            else if(i==flowerbed.length-1){
                if(flowerbed[i] == 0 && flowerbed[i-1] == 0){
                    flowerbed[i]=1;
                    n--;
                }
            }
            else{
                if(flowerbed[i] == 0 && flowerbed[i+1] == 0 && flowerbed[i-1] == 0){
                    flowerbed[i]=1;
                    n--;
                }
            }
            i++;
            if(n==0){
                return true;
            }
        }
        return false;

    }
}
