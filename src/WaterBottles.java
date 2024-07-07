public class WaterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        int empty = numBottles;
        int total = numBottles;
        while(empty>=numExchange){
            int rem = empty % numExchange;
            int exchanged = (int) empty/numExchange;
            total+=exchanged;
            empty = rem + exchanged;
        }
        return total;
    }
}
