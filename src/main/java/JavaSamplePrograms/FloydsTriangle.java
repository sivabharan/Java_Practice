package JavaSamplePrograms;

import java.util.Scanner;

public class FloydsTriangle {

    private static int numberofrows;

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of row's for Floyds Triangle:");
        numberofrows = scanner.nextInt();
        constructFloydsTriangle(numberofrows);

    }

    public static void constructFloydsTriangle(int rows){
        int number = 1;
        System.out.println("Floyd's triangle");
        System.out.println("****************");
        for(int i= 1;i<= rows;i++ ){
            for(int j =1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
