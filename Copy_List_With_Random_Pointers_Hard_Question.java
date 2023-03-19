
// https://www.youtube.com/watch?v=VNf6VynfpdM

class Solution {
    public Node copyRandomList(Node head) {
        Node iter = head;
        Node front = head;
        
        while(iter != null)
        {
            front = iter.next;
            Node node1 = new Node(iter.val);
            iter.next = node1;
            node1.next = front;
            iter = front;
        }
        
        iter = head;
        while(iter != null)
        {
            if(iter.random != null)
            {
                iter.next.random = iter.random.next;
            }
            else
                iter.next.random = null;
            
            iter = iter.next.next;
        }
        
        iter = head;
        Node dummy = new Node(0);
        Node copy = dummy;
        
        front = head;
        
        while(iter != null)
        {
            front = iter.next.next;
            copy.next = iter.next;
            copy = copy.next;
            iter.next = front;
            iter = iter.next;
        }
        return dummy.next;
    }
}
