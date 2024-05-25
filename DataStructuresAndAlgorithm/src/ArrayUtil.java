
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
        ArrayUtil aarPrint = new ArrayUtil();
        aarPrint.printNewArray(new int[] {2,4,6,8,10});
    }
    public void printNewArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i <n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
