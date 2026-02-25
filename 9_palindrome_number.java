class Solution {
    public boolean isPalindrome(int x) {
        String xValue = Integer.toString(x);
        StringBuilder sb = new StringBuilder(xValue);
        String reversedValue = sb.reverse().toString();
        if(xValue.equals(reversedValue)){
            return true;
        }
        return false;
    }
}