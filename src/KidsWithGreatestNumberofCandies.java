import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberofCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> op = new ArrayList<>();
        int n = candies.length;
        int maximum = candies[0];
        for(int i = 1; i < n; i++){
            if(candies[i]>maximum){
                maximum = candies[i];
            }
        }

        for(int i = 0; i < n; i++){
            op.add(candies[i]+extraCandies>=maximum);
        }
        return op;
    }
}
