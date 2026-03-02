package LEETCODE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L15 {
    static List<List<Integer>> threeSum(int[] a) {
        Arrays.sort(a);
        int n =a.length;
        List<List<Integer>> ans =new ArrayList<>();
        for (int i =0;i<n-2;i++)
        {
            if (i>0 && a[i]==a[i-1])continue;
            int j =i+1;
            int k =n-1;
            int sum =-1*a[i];
            while (j<k)
            {
                if (a[j]+a[k]==sum)
                {
                    ans.add(Arrays.asList(a[i],a[j],a[k]));
                    j++;
                    k--;
                    while (j<n && a[j]==a[j-1])j++;
                    while (k>=0 && a[k]==a[k+1])k--;
                }
                else if (a[j]+a[k]<sum) j++;
                else k--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }

}
