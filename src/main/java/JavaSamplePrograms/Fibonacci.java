package JavaSamplePrograms;

import java.util.*;

public class Fibonacci {

    public static void main(String[] args) { //input to print JavaSamplePrograms.Fibonacci series upto how many numbers
        System.out.println("Enter number upto which JavaSamplePrograms.Fibonacci series to print: ");
        int number = new Scanner(System.in).nextInt();
        System.out.println("JavaSamplePrograms.Fibonacci series upto " + number + " numbers : ");
        //printing JavaSamplePrograms.Fibonacci series upto number
        for (int i = 1; i <= number; i++) {
            System.out.print(fibonacciCalucator(i) + " ");
        }
    }

        public static int fibonacciCalucator(int num){
            if (num == 1 || num == 2) {
                return 1;
            }

            int fib1 = 1;
            int fib2 = 1;
            int fib = 1;
            for (int i = 3; i <= num; i++) {
                fib = fib1 + fib2;
                fib1 = fib2;
                fib2 = fib;
            }
            return fib;
        }

//    /* * Java program for JavaSamplePrograms.Fibonacci number using recursion. * This program uses tail recursion to calculate JavaSamplePrograms.Fibonacci number for a given number * @return JavaSamplePrograms.Fibonacci number */
//    public static int fibonacci(int number)
//    { if(number == 1 || number == 2){ return 1; }
//    return fibonacci(number-1) + fibonacci(number -2); //tail recursion
//    }

    }

