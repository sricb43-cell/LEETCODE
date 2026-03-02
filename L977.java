package LEETCODE;

public class L977 {
    static int[] sortedSquares(int[] a) {
        int n =a.length;
        int [] ans =new int[n];
       int noOfNegative =0;
       for (int i =0;i<n;i++)
       {
           if (a[i]<0)noOfNegative++;
           else break;
       }
      int i =0;
       int j =noOfNegative-1;
        while (i<j)
        {
            int temp =a[i];
            a[i] =a[j];
            a[j] =temp;
            i++;
            j--;
        }
       for (int m =0;m<n;m++)
       {
           a[m] =a[m]*a[m];
       }
       i =0;
       j =noOfNegative;
       int k =0;
       while (i<noOfNegative && j<n)
       {
           if (a[i]<a[j])
           {
               ans[k] =a[i];
               i++;
               k++;
           }
           else
           {
               ans[k]=a[j];
               j++;
               k++;
           }
       }
        while (i < noOfNegative)
        {
            ans[k] = a[i];
            k++;
            i++;
        }
        while (j<a.length)
        {
            ans[k] =a[j];
            k++;
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}


