class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        if(head == null)
            return null;
        
        while(cur.next != null)
        {
            if(cur.val == cur.next.val){
            ListNode temp = cur.next.next;
            cur.next = temp;
            temp = null;
            }
            else
            cur = cur.next;
        }
        return head;
    }
}
