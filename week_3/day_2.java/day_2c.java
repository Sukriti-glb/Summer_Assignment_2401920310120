class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head,slow=head;
        while(fast!=null&& fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        if(fast!=null){
            slow=slow.next;
        }
        slow=reverseList(slow);
        fast=head;
        while(slow!=null){
            if(fast.val!=slow.val){
                return false;
            }
            fast=fast.next;
            slow=slow.next;
        }
        return true;
    }
    private ListNode reverseList(ListNode head){
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