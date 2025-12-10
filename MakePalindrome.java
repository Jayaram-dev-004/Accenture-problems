import java.util.Scanner;

public class MakePalindrome {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    
    int reversedNum = reverseFun(n);
    boolean res = isPalindrome(n,reversedNum);
    
    if(res) 
    {
        System.out.println(res);
        return;
    }

    int newNum = n;
    while(!isPalindrome(newNum, reversedNum))
    {
        newNum = newNum + reversedNum;
        reversedNum = reverseFun(newNum);
        System.out.println(newNum);
    }

    System.out.println(newNum);
    }



    // Reverse the number
    public static int reverseFun(int n){
        int sum = 0;

        while(n > 0){
            int rem = n % 10;
            sum = rem + sum*10;
            n /= 10;
        }
        return sum;
    }

    // Check for palindrome
    public static boolean isPalindrome(int n1, int n2){
        return (n1 == n2)? true : false;
    }

}
