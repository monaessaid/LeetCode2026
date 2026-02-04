class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Map<Character, Integer> visited = new HashMap<>();
        for (int rp = 0, lp = 0; rp < s.length(); rp++) {
            char c = s.charAt(rp);
            // The first part is if there is a repeated character
            // The second part is to make sure that the repeated character is within the current substring
            if (visited.containsKey(c) && visited.get(c) >= lp) {
                // Left pointer should be moved one past where the repeated character is earlier in the sequence 
                lp = visited.get(c) + 1;
            }
            maxLength = Math.max(maxLength, rp - lp + 1);
            visited.put(c, rp);
        }
        return maxLength;
    }
}