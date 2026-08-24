class Solution {
    public boolean isPalindrome(String s) {
        // String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        s = s.toLowerCase();
        String str = "";
        for(char ch : s.toCharArray()){
            if(ch>='a' && ch<='z' || (ch >= '0' && ch <= '9')){
                str += ch;
            }
        }
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
