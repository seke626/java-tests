class Node {
    private Node leftChild, rightChild;
    
    public Node(Node leftChild, Node rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
    
    public Node getLeftChild() {
        return this.leftChild;
    }
    
    public Node getRightChild() {
        return this.rightChild;
    }

    public int height() {
        return heightHelper(this);
    }

    private int heightHelper(Node node) {
        if (node == null) {
            return -1; // Height of an empty subtree is -1
        }
        
        int leftHeight = heightHelper(node.getLeftChild());
        int rightHeight = heightHelper(node.getRightChild());
        
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        Node leaf1 = new Node(null, null);
        Node leaf2 = new Node(null, null);
        Node node = new Node(leaf1, null);
        Node root = new Node(node, leaf2);

        System.out.println(root.height()); // Output: 2
    }
}