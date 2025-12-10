public class SecondLargest{
public static void main(String[] args) {
    int[] arr = {3, 2, 1, 7, 5, 4};
    System.out.println(secondLargestSum(arr));  
}

public static int secondLargestSum(int[] arr) {
    int n = arr.length;

    if (n <= 3) return 0;

    int largestEven = Integer.MIN_VALUE;
    int secondLargestEven = Integer.MIN_VALUE;

    int smallestOdd = Integer.MAX_VALUE;
    int secondSmallestOdd = Integer.MAX_VALUE;

    for (int i = 0; i < n; i++) {
        if (i % 2 == 0) {  // Even position
            if (arr[i] > largestEven) {
                secondLargestEven = largestEven;
                largestEven = arr[i];
            } else if (arr[i] > secondLargestEven && arr[i] != largestEven) {
                secondLargestEven = arr[i];
            }
        } else {  // Odd position
            if (arr[i] < smallestOdd) {
                secondSmallestOdd = smallestOdd;
                smallestOdd = arr[i];
            } else if (arr[i] < secondSmallestOdd && arr[i] != smallestOdd) {
                secondSmallestOdd = arr[i];
            }
        }
    }

    return secondLargestEven + secondSmallestOdd;
}
}