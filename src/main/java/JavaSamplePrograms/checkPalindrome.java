package JavaSamplePrograms;

import java.util.Scanner;

public class checkPalindrome {
    public static void main(String args[]){

        System.out.println("Please Enter a number : ");
        int palindrome = new Scanner(System.in).nextInt();

        if(isPalindrome(palindrome)){
            System.out.println("Number : " + palindrome + " is a palindrome");
        }else{
            System.out.println("Number : " + palindrome + " is not a palindrome");
        }

    }

    /*
     * Java method to check if number is palindrome or not
     */
    public static boolean isPalindrome(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            System.out.println(remainder);
            reverse = reverse * 10 + remainder;
            System.out.println(reverse);
            palindrome = palindrome / 10;
            System.out.println(palindrome);
        }

        // if original and reverse of number is equal means
        // number is palindrome in Java
        if (number == reverse) {
            return true;
        }
        return false;
    }

}


/**
 * public boolean isPalindromeRecursive(String text){
 *     String clean = text.replaceAll("[\\W]|", "");
 *     another way replaceAll("[^a-zA-Z]", "").toLowerCase();
 *     return recursivePalindrome(clean,0,clean.length()-1);
 * }
 *
 * private boolean recursivePalindrome(String text, int forward, int backward) {
 *     if (forward == backward) {
 *         return true;
 *     }
 *     if ((text.charAt(forward)) != (text.charAt(backward))) {
 *         return false;
 *     }
 *     if (forward < backward + 1) {
 *         return recursivePalindrome(text, forward + 1, backward - 1);
 *     }
 *
 *     return true;
 * }
 */

