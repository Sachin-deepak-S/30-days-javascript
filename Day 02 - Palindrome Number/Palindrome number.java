class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString( x);
        Boolean pal = true;
        int left = 0;
        int right = s.length()-1;
        while(left < (s.length()/2)){
            if(s.charAt(left) != s.charAt(right)){
                pal = false;
                break;
            }
            left++;
            right--;
        }
        if(pal == true){
            return true;
        }else{
            return false;
        }
    }
}