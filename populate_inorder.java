class Solution 
{
    private Node prev = null;

    public void populateNext(Node root) 
    {
        populateNextUtil(root);
    }

    private void populateNextUtil(Node node) 
    {
        if (node == null) return;

        populateNextUtil(node.left);

        if (prev != null) 
        {
            prev.next = node;
        }

        prev = node;

        populateNextUtil(node.right);
    }

    public static void main(String[] args) 
    {
        Solution sol = new Solution();

        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(12);
        root.left.left = new Node(3);

        sol.populateNext(root);

        Node current = root.left.left;
        while (current != null) {
            System.out.print(current.data + "->");
            if (current.next != null) 
            {
                System.out.print(current.next.data + " ");
            } 
            else 
            {
                System.out.print("-1 ");
            }
            current = current.next;
        }
    }
}
