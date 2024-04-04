public class TimeComlexityDemo {
    public static void main(String[] args){
        double now = System.currentTimeMillis();
        TimeComlexityDemo demo = new TimeComlexityDemo();
        System.out.println(demo.findSum(9999999));

        System.out.println("Time taken- " + (System.currentTimeMillis()- now)+ " millisecs.");

    }
//    public int findSum(int n){
//        return n * (n+1)/2;
//    }
    public int findSum(int n){
        int sum = 0;
        for(int i = 1; i <=n; i++){
            sum =sum +i;
        }
        return sum;
    }
}
