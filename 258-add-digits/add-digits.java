class Solution {
    public int addDigits(int num) {
        int sum =0;
        int d;
        
        while(num > 0){
            d = num%10;
            sum = sum+d;
            num = num/10;
        }
        
        
        
        
        while(sum >= 10 ){
            int a =0;

            while(sum>0){
                d = sum%10;
                a =a+d;
                sum = sum/10;
            }
            sum =  a;
        }
        return sum;

    }
}