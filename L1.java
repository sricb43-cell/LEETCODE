package LEETCODE;
// two sum
public class L1 {
    public int[] twoSum(int[] a, int target) {
        int [] ans =new int[2];
        for(int i=0;i<a.length;i++)
        {
            for(int j =i+1;j<a.length;j++)
            {
                if (a[i]+a[j]==target)
                {
                    ans[0] =i;
                    ans[1] =j;
                    return ans;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }

}
