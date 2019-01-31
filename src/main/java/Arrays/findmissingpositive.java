package Arrays;

// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public static int solution(int[] A, int size) {
        // write your code in Java SE 8
        //function to segregate all negative including 0 to the left side of array A.

        int j=0,i;
        for(i=0;i < size; i++)
        {
            if(A[i] <=0)
            {
                int temp;
                temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                j++; //Incrementing count of non-positive integers
            }
        }
        return j;
    }

    public static int findMissingPositive(int A[], int size) {
        //Function to find the smallest positive missing number in an array.
        int i;
        for(i=0;i<size;i++)
        {
            int x = Math.abs(A[i]);
            if(x -1 < size && A[x - 1] > 0)
                A[x - 1] = -A[x - 1];
        }
        //Return the first positive index value
        for(i=0;i<size;i++)
            if(A[i] > 0)
                return i;
        return size+1;
    }

    public static int findMissing(int A[], int size) {
        //Find the smallest positive in array which contains both positive and negative.
        int shift = solution(A,size);
        int array[] = new int[size-shift];
        int j=0;
        for(int i = shift;i<size;i++)
        {
            array[j] = A[i];
            j++;
        }
        return findMissingPositive(array,j);
    }

    //main function

    public static void main (String[] args) {
        int A[] = {-6,-91,1011,-100,84,-22,0,1,473};
        int array_size = A.length;
        int missing = findMissing(A,array_size);
        System.out.println("The Smallest positive missing num"+ missing);
    }
}
