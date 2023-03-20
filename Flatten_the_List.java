class LinkedList
{
    Node flatten(Node root)
    {
    	if(root == null || root.next == null)
    	return root;
    	
    	root.next = flatten(root.next);
    	
    	root = mergeLists(root, root.next);
    	
    	return root;
    }
    
    Node mergeLists(Node a, Node b)
    {
        Node temp = new Node(0);
        Node ref = temp;
        while(a != null && b != null)
        {
            if(a.data < b.data)
            {
                temp.bottom = a;
                temp = temp.bottom;
                a = a.bottom;
            }
            else
            {
                temp.bottom = b;
                temp = temp.bottom;
                b = b.bottom;
            }
        }
        if(a == null)
        temp.bottom = b;
        else
        temp.bottom = a;
        
        return ref.bottom;
        
    }
}
