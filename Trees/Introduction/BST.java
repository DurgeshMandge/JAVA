public class BST {
    class Node{
        Node left;
        Node right;
        int val;
        int height;

        Node(int val){
            this.val=val;
        }
        int getValue(){
            return val;
        }
    }

    Node root;

    public BST(){}

    int height(Node node){
        if(node == null){return -1;}
        return node.height;
    }

    boolean isEmpty(){
        return root==null;
    }

    void insert(int val){
        root = insert(root,val);
    }

    Node insert(Node node, int val){
        if(node==null){
            Node n = new Node(val);
            return n;
        }
        if(val < node.val){
            node.left= insert(node.left,val);
        }else{
            node.right= insert(node.right,val);
        }
        node.height = Math.max(height(node.left),height(node.right))+1;
        return node;
    }

    void populate(int[] arr){
        for(int i:arr){
            this.insert(i);
        }
    }

    void populateSorted(int[] arr){
        populateSorted(arr,0,arr.length);
    }

    private void populateSorted(int[] arr, int start, int end) {

        if(start>=end){
            return;
        }

        int mid = start+(end-start)/2;

        this.insert(arr[mid]);

        populateSorted(arr, start, mid);
        populateSorted(arr, mid+1, end);
    }

    boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }

    void display(){
        display("Root node : ", this.root);
    }
    
    void display(String msg, Node node){
        if(node==null){
            return;
        }
        System.out.println(msg + node.val);
        display("Left child of "+node.val+" : ", node.left);
        display("Right child of "+node.val+" : ", node.right);
    }
}
