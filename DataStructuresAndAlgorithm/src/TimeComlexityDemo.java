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

    }
}
