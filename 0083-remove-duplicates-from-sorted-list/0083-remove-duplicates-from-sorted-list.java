
class Solution {
    public ListNode deleteDuplicates(ListNode head){
        ListNode left = head;
        while(left!=null&&left.next!=null){
            if (left.val==left.next.val){
                left.next=left.next.next;
            }
            else{
                left=left.next;
            }
        }
        return head;
        
    }
};