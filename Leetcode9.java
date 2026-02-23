class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int prod = 0;
        while(x>0){
            int ld = x % 10;
            prod = prod * 10 + ld;
            x/=10;
        }
        if (prod == temp)
        return true;
        return false;
    }
}
