package JavaSamplePrograms;

import java.util.Scanner;
/*Converting Decimal to hex*/
public class ConvertToHex {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Decimal number to convert to hex");
        int num = scanner.nextInt();
        System.out.println(converttohex(num));


    }

    public static String converttohex(int number) {

        int remainder;
        String result="";
        // Digits in hexadecimal number system
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(number > 0)
        {
            remainder = number%16;
            result = hex[remainder]+result;
            number = number/16;

        }
        return result;
    }

}
