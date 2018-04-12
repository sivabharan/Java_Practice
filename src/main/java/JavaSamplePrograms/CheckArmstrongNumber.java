package JavaSamplePrograms;

import java.util.Scanner;

public class CheckArmstrongNumber {

    public static void main(String args[]){

        System.out.println("Please Enter a number : ");
        int numberToCheck = new Scanner(System.in).nextInt();
        armstrongchecker(numberToCheck);
    }

    public static void armstrongchecker(int n){
        int temp,armStrong=0;
        temp = n;
        while(n>0){
            int number = n%10;
            n = n/10;
            armStrong = armStrong+(number*number*number);
        }
        if (temp == armStrong) {
            System.out.println(armStrong +" is a armstrongnumber");
        }else
            System.out.println(armStrong +" is not a armstrongnumber");
    }
}
