class Solution {
    public String decodeString(String s) {
         Stack<String> stringstack=new Stack<>();
         Stack<Integer> integerstack=new Stack<>();
          String currString="";
          int currNum=0;

          for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                currNum=currNum*10+(ch-'0');
            }
            else if(ch=='['){
                integerstack.push(currNum);
                stringstack.push(currString);
                currNum=0;
                currString="";
            }
            else if(ch==']'){
                int repeat=integerstack.pop();
                String again=stringstack.pop();
                StringBuilder temp = new StringBuilder(again);
                for (int i = 0; i < repeat; i++) {
                    temp.append(currString);
                }
                currString = temp.toString();
            }
            else {
                currString += ch;
            }
        }
        return currString;
    }
}