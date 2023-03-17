class Solution {
    public ListNode sortList(ListNode head) {
        ListNode cur = head;
        int cnt=0;
        while(cur != null)
        {
            cnt++;
            cur = cur.next;
        }
        cur = head;
        for(int i=0; i<cnt; i++)
        {
            while(cur.next != null)
            {
                if(cur.val > cur.next.val)
                {
                    int temp = cur.val;
                    cur.val = cur.next.val;
                    cur.next.val = temp;
                    
                    cur = cur.next;
                }
                else
                    cur = cur.next;
            }
            cur = head;
        }
        return head;
    }
}
