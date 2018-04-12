package JavaSamplePrograms;

import java.util.Scanner;

public class MethodOverloading {

    public  static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of X");
        float x = scanner.nextFloat();
        System.out.println("Enter the value of Y");
        float y = scanner.nextFloat();
        System.out.println("Enter the value of r");
        double r = scanner.nextDouble();
        System.out.println("Area of Square =" + calculatearea(x));
        System.out.println("Area of Triangle =" + calculatearea(x,y));
        System.out.println("Area of Circle =" + calculatearea(r));


    }

    public static float calculatearea(float x){
         return x*x;
    }

    public static float calculatearea(float x, float y){
        return (x*y)/2;
    }

    public static double calculatearea(double r){
        return 3.14*r*r;
    }

}
