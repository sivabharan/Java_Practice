package LeetCodeSamples;
import java.util.*;

/**
 * You have a list of points in the plane.
 * Return the area of the largest triangle that can be formed by any 3 of the points.
 */

public class LargestTriangleArea {
    public double largestTriangleArea(int[][] points) {
        int N = points.length;
        double ans = 0;
        for (int i = 0; i < N; ++i)
            for (int j = i+1; j < N; ++j)
                for (int k = j+1; k < N; ++k)
                    ans = Math.max(ans, area(points[i], points[j], points[k]));
        return ans;
    }

    public double area(int[] P, int[] Q, int[] R) {
        return 0.5 * Math.abs(P[0]*Q[1] + Q[0]*R[1] + R[0]*P[1]
            -P[1]*Q[0] - Q[1]*R[0] - R[1]*P[0]);
    }
}
