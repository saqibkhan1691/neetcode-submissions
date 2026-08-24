class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] arr = str.toCharArray();
        int n = arr.length;

        for(int i=0; i<n; i++){
            if(arr[i]!=arr[n-1-i]){
                return false;
            }
        }
        return true;
    }
}
