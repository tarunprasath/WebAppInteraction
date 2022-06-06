package javaadvancedbasics;

public class checkPrimeNumber {
    public static void main(String args[]){
        int inputnumber=3;
        System.out.println("Check if the number is prime:");
        isPrime(inputnumber);
    }

    private static boolean isPrime(int inputnumber) {
        if(inputnumber % 2 ==0){
            return false;
        }
        return true;
    }
}
