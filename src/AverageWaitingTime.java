public class AverageWaitingTime {
    public double averageWaitingTime(int[][] customers) {
        double op = 0.0;
        long finalTime = 0;
        long time = 0;
        for(int[] times : customers){
            time = Math.max(time,times[0]);
            time += times[1];
            finalTime += (time - times[0]);
        }

        op = (double) finalTime/customers.length;

        return op;
    }
}
