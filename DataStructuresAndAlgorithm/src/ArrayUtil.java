
public class ArrayUtil {
    public void printArray(int[] arr){
        int n = arr.length;
        for(int i =0; i< n; i++){
            System.out.println(arr[i] +" ");
        }
        System.out.println();
    }


    public void arrayDemo(){
        int[] myArray = new int[5];
        //printArray(myArray);
        myArray[0] = 5;
        myArray[1] = 6;
        myArray[2] = 8;
        myArray[3] = 7;
        myArray[4] = 4;
        printArray(myArray);
    }

    public static void main (String[] args){
        ArrayUtil arrUtil = new ArrayUtil();
        arrUtil.arrayDemo();
    }
}
