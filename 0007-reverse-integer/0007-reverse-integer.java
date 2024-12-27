class Solution {
    public static int reverse(int x) {
        int temp = Math.abs(x);
                    int i = 2147483647;
        int ans = 0;
        while(temp>0)
        {
            if((ans*10.0)>i)
                return 0;
            byte digit = (byte)(temp%10);
            temp = temp/10;
            ans=(ans*10)+digit;
        }
        if(x<0)
            return ans*(-1);

        return ans;
    }
}
