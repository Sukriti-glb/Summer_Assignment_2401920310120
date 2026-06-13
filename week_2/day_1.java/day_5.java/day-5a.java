class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null||strs.length==0){
            return new ArrayList<>();
        }
        Map<String, List<String>> freqMap= new HashMap<>();
        for(String str:strs){
            String freqstr=getFrequencyString(str);
            if(freqMap.containsKey(freqstr)){
                freqMap.get(freqstr).add(str);
            }
            else{
                List<String> strList=new ArrayList<>();
                strList.add(str);
                freqMap.put(freqstr,strList);
            }
        }
        return new ArrayList<>(freqMap.values());
    }
     private String getFrequencyString(String str){
        int[] freq= new int[26];
        for(char c:str.toCharArray()){
            freq[c-'a']++;
        }
        StringBuilder frequencyString =new StringBuilder("");
        char c='a';
        for(int i:freq){
            frequencyString.append(c);
            frequencyString.append(i);
            c++;
        }
        return frequencyString.toString();
     }
}       