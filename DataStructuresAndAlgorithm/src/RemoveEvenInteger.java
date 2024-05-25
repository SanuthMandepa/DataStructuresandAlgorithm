public class RemoveEvenInteger {
    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i =0; i< n; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static int[] removeEven(int[] arr) {
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[idx] = arr[i];
                idx++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4 ,2, 3, 4,7, 9, 12,15};
        printArray(arr);
        int[] result = removeEven(arr);
        printArray(result);

    }
}
