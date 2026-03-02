package LEETCODE;

import java.util.Arrays;

public class L16 {
    static int threeSumClosest(int[] a, int target) {
        int n =a.length;
        Arrays.sort(a);
        int maxx_diff =Integer.MAX_VALUE;
        int rest_sum =0;
        for (int i =0;i<n-2;i++)
        {
            int j =i+1;
            int k =n-1;
            while (j<k) {
                int sum =a[i]+a[j]+a[k];
                int diff = Math.abs(sum - target);
                if (maxx_diff > diff) {
                    maxx_diff = diff;
                    rest_sum = sum;
                if (sum == target) {
                    return rest_sum;
                } else if (sum < target) {
                    j++;
                    }
                } else k--;
            }
        }
        return rest_sum;
    }
    public static void main(String[] args) {

    }

}
