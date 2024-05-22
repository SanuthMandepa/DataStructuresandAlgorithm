public class TimeComplexity {

    public static void main(String[] args) {
        TimeComplexity timeComplexity1 = new TimeComplexity();

        long startTime = System.currentTimeMillis();
        int result = timeComplexity1.findSum1(6000);
        long endTime = System.currentTimeMillis();

        System.out.println("Sum: " + result);
        System.out.println("Execution Time: " + (endTime - startTime) + " milliseconds");
    }

//    public int findSum1(int n) {
//        return n * (n + 1) / 2;
//    }
    public int findSum1(int n){
        int sum = 0;
        for(int i =1 ;i<=n; i++){
            sum = sum+i;
        }
        return sum;
    }
}
