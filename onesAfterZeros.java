// No of 1’s After Each 0’s

public class onesAfterZeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1};
        System.out.println(noOfZeros(arr));
    }

    public static int noOfZeros(int[] arr){
        int res = 0;
        int ones = 0;

        for(int i = arr.length-1; i >= 0; i--){
            
            if(arr[i] == 0){
                res += ones;
            }
            else
                ones++;
        }

        return res;
         
    }
    
}
