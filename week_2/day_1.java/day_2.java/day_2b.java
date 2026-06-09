class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int[] first = new int[26];
        int[] second = new int[26];

        for(char c:s1.toCharArray()) {
            first[c-'a']++;
        }

        int window =s1.length();

        for(int i=0; i<s2.length();i++) {

            second[s2.charAt(i)-'a']++;

            if(i>= window) {
                second[s2.charAt(i-window)-'a']--;
            }
            if(i>=window-1) {
                if(match(first, second))
                    return true;
            }
        }
        return false;
    }

    private boolean match(int[] first, int[] second) {
        for(int i=0;i<26;i++) {
            if(first[i]!=second[i])
                return false;
        }
        return true;
    }
}