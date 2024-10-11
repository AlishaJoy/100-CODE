//CHECK IF POWER OF TWO

import java.util.*;
class Solution {
    public boolean isPowerOfTwo(int n) {
        int i = 0;
        boolean flag = false;
        for(i=0;i<n+1;i++){
            if(Math.pow(2,i) == n)
            {  flag = true ;
            break;}
        }
        
        return flag;

    }
}
//------------------------------------optimal code below------------------------------------------------------
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
