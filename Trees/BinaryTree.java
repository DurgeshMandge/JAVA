package Trees;

public class BinaryTree {
    public class  Node {
        int val;
        int height;
        Node left;
        Node right;

        public Node(int value){
            this.val = value;
        }
        int getValue(){
            return val;
        }
    }
    private Node root;

    int height(Node n){
        if(n==null){
            return -1;
        }
        return n.height;
    }

    boolean isEmpty(){
        return root==null;
    }

    public void display(){
        display(root,"Root Node ");
    }
}
