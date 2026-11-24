class Solution {
    public int GetInt(int n){
        int sum = 0;
        while (n>0){
            int digit = n % 10;
            sum+= digit*digit; 
            n= n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow=n,fast=n ;
        do{
            slow=GetInt(slow);
            fast=GetInt(GetInt(fast));

        }while(slow!=fast);
        return slow==1;  
    }
}