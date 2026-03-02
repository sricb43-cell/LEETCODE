package LEETCODE;

public class L167 {
    public int[] twoSum(int[] arr, int target) {
        int [] ans =new int[2];
        int i =0;
        int j =arr.length-1;
        if(arr.length==2)
        {
            if(arr[0]+arr[1]==target)
            {
                ans[0] =0+1;
                ans[1] =1+1;
                return ans;
            }
        }
        if(arr.length>2)
        {
            while (i<j)
            {
                if (arr[i]+arr[j]==target)
                {
                    ans[0] =i+1;
                    ans[1] =j+1;
                    return ans;
                }
                else if (arr[i] + arr[j] <target) {
                    i++;
                }
                else j--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
    }

}
