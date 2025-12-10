import java.util.Arrays;

public class MakeAscending {
    public static void main(String[] args) {
        int[] arr1 = {4,3,5,6,7,5,3,2};
        int[] arr2 = {1,3,5};
        int m = arr1.length;
        int n = arr2.length;
        ascendingMethod2(arr1, arr2, m, n);
        System.out.println(Arrays.toString(arr1));
    }
    public static void ascendingMethod1(int[] arr1, int[] arr2, int m, int n){
        for(int i = 0; i < n; i++)
        {
            int counter = arr2[i];
            int[] newArr = new int[counter];

            for(int j = 0; j < counter; j++)
                newArr[j] = arr1[m - 1 - j];
            
            Arrays.sort(newArr);
            
            for(int k = 0; k < counter; k++)
                arr1[m - 1 -k] = newArr[newArr.length - 1 - k];
        }
    }
    public static void ascendingMethod2(int[] arr1, int[] arr2, int m, int n){
      
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            max = Math.max(max, arr2[i]);
        }
        int[] newArr = new int[max];

        for(int j = 0; j < max; j++)
            newArr[j] = arr1[m - 1 - j];
        
        Arrays.sort(newArr);
        
        for(int k = 0; k < max; k++)
            arr1[m - 1 -k] = newArr[newArr.length - 1 - k];

    }
}
