//package JavaSamplePrograms;
//
//
//import java.util.*;
//
//public class ArrayOfNumbersSum {
//
//            static boolean array(int A[],int arr_size,int sum)
//            {
//                int b,c;
//                Arrays.sort(A);
//                b =0;
//                c = arr_size-1;
//                while (b < c) {
//                    if (A[b]+A[c] == sum)
//                        return true;
//                    else if(A[b] + A[c] < sum)
//                        b++;
//                    else
//                        c--;
//                }
//                return false;
//            }
//            System.out.println("Hello, world!");
//        }
//
//
//    public static void main(String[] args) {
//    {
//        int A[] = {1, 4, 45, 6, 10, -8};
//        int n = 16;
//        int arr_size = A.length;
//
//        // Function calling
//        if(hasArrayTwoCandidates(A, arr_size, n))
//            System.out.println("Array has two " +
//                "elements with given sum");
//        else
//            System.out.println("Array doesn't have " +
//                "two elements with given sum");
//
//    }
//
//}
