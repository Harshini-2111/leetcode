// Last updated: 28/09/2025, 20:14:48
class Solution {
    public boolean isUgly(int n) {
        for (int i=2; i<6 && n>0; i++){
            while(n%i==0){
                n/=i;
            }
        }
        return n==1;
    }
}