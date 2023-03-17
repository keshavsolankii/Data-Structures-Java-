// Testcase -->  [1,2,3,4,5] = [1,3,5,2,4]   OR   [1,2,4,6,3,7,9,8] = [1,3,7,9,2,4,6,8]

class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode curr = head;
        ListNode tail = head;
        ListNode temp = head;
        ListNode prev = null;
        
        if(head == null || head.next == null)
            return head;
        int cnt = 1;
        while(tail.next != null)
        {
            tail = tail.next;
            cnt++;
        }
        
        while(cnt>0)
        {
            if(curr.val%2 == 0)
            {
                temp = curr.next;
                tail.next = curr;
                curr.next = null;
                tail = tail.next;
                curr=temp;
                prev.next = curr;
            }
            else{
                prev = curr;
                curr = curr.next;
            }
            cnt--;
        }
        return head;
    }
}
