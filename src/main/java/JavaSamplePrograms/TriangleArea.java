package JavaSamplePrograms;

import java.util.Scanner;

public class TriangleArea {
      public static void main(String args[]) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter the Heigh of the Triangle");
          double height = scanner.nextDouble();
          System.out.println("Enter the Width of the Triangle");
          double width = scanner.nextDouble();
          double area = (height*width)/2;
          System.out.println("Area of the Triangle = " + area);

      }
}
