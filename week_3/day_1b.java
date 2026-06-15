class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<Integer> valueStack=new Stack<>();
        while(head!=null){
            valueStack.push(head.val);
            head=head.next;   
             }
             ListNode revList=new ListNode(Integer.MIN_VALUE);
             ListNode ptr=revList;
              
              while(!valueStack.isEmpty()){
                ptr.next=new ListNode(valueStack.pop());
                ptr=ptr.next;
              }
              return revList.next;
    }
}