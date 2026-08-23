class Solution {
    public boolean isPalindromic(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<=j)
            {
                int a=s.charAt(i);
                int b=s.charAt(j);
                for(int k=0;k<8;k++)
                    {
                        int ba=(a>>k)&1;
                        int bb=(b>>(7-k))&1;
                        if(ba!=bb)
                            return false;
                    }
                i++;
                j--;
            }
        return true;
    }
}