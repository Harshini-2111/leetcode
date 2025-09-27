// Last updated: 27/09/2025, 10:47:45
class Solution {
    public boolean isHappy(int n) {
        while(true){
            if(n==1 || n==7){
                return true;
            }
            if((n>=2 && n<=6) || n==8 || n==9){
                return false;
            }
            int sum = 0;
            while(n!=0){
                sum+=Math.pow(n%10,2);
                n=n/10;
            }
            n=sum;
        }
    }
}