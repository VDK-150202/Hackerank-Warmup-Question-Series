class Solution {
    int isPalindrome(String S) {
        // code here
        char[] arr= S.toCharArray();
        int start=0;
        int end= arr.length-1;
        
        while(start<end){
            if(arr[start]!=arr[end]){
                return 0;
            }
            start++;
            end--;
        }
        return 1;
    }
};
