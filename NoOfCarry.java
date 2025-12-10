public class NoOfCarry {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 9;
        System.out.println(findCarry(n1,n2));
    }

    public static int findCarry(int n1, int n2){
        int result = 0;
        int sumOfDigit = 0;
        while(n1 > 0 && n2 > 0){
            sumOfDigit += getDigit(n1) + getDigit(n2);
            n1 /= 10; n2 /= 10;
            
            if(sumOfDigit > 9){
                result++;
                sumOfDigit /= 10;;
            }            
        }
        return result;
    }

    public static int getDigit(int num){
        return num % 10;
    }
}
