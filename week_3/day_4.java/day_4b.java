class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack= new Stack<>();
        for(String token:tokens){
            if(isOp(token)){
                int num2=stack.pop();
                int num1=stack.pop();
                int result=0;
                  if(token.equals("+")){
                    result=num1+num2;
                    }
                else if(token.equals("-")){
                    result=num1-num2;
                } else if(token.equals("*")){
                    result=num1*num2;
                }
                 else if(token.equals("/")){
                    result=num1/num2;
                }
                stack.push(result);
            }
                else
                    stack.push(Integer.parseInt(token));
            }
        return stack.peek();
    }
    private boolean isOp(String str){
        if(str.equals("+")||str.equals("-")||str.equals("*")||str.equals("/")){
        return true;
    }
    return false;
}
}