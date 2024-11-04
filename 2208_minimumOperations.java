class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int minimumOperations = 0;
        double sumNums = 0.0;
        for(double num: nums){
            pq.add(num);
            sumNums+=num;
        }
        double newSum = sumNums;
        while(newSum > (sumNums/2)){
            double val = pq.remove();
            newSum-=val;
            val = val/2;
            pq.add(val);
            newSum+=val;
            minimumOperations++;
        }
        return minimumOperations;
    }
}
