class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int maxLength = 0;
        for(int i  = 0; i<s.length(); i++){
            HashSet<Character> char_set = new HashSet<>();
            int length = 0;
            for(int j = i; j< s.length(); j++){
                char ch = s.charAt(j);
                if(char_set.contains(s.charAt(j))){
                    break;
                }
                char_set.add(ch);
                length++;
            }
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }
}