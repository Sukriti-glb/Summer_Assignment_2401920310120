class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int charcount[]= new int[26];
        for(char c:magazine.toCharArray()){
            charcount[c-'a']++;
        }
        for(char c: ransomNote.toCharArray()){
            if(charcount[c-'a']==0)
            return false;
        charcount[c-'a']--;
        }
    return true;
    }
}