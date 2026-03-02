package LEETCODE;

public class L26 {
    static int removeDuplicates(int[] a) {
        int n =a.length;
        int i =0;
        int j =i+1;
        int no =1;
        while (j<n)
        {
            if (a[i]==a[j])j++;
           else if (a[i]!=a[j])
            {
                a[i+1] =a[j];
                no++;
                i =i+1;
                j++;
            }
        }
        return no;
    }
    public static void main(String[] args) {

    }

}

