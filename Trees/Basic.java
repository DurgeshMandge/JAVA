// package quetions;

import java.util.Scanner;

public class Basic {
    
    private class Node {
        int val;
        Node right;
        Node left;
        public Node(int value){
            this.val = value;
        }
    }

    public static void main(String[] args) {
        Basic b = new Basic();
        Node root = b.new Node(5);
        //Create the tree
        populateTree(root);

        //Print it
        preetyPrint(root,0);
    }
    
    private static void preetyPrint(Node root,int indent) {
        if(root == null){return;}
        preetyPrint(root.right,indent++);
        if(indent != 0){
            for(int i = 0;i<indent;i++){
                System.out.printf("|\t\t");
            }
            System.out.println("|----> " + root.val);
        }else{
            System.out.println(root.val);
        }
        
        preetyPrint(root.right, indent++);
    }

    private static void populateTree(Node node) {
        Scanner sc = new Scanner(System.in);
        helper(node,sc);
    }

    private static void helper(Node node, Scanner sc) {
        if(node == null){return;}
        System.out.println("Do u want to add left of " + node.val);
        boolean ansL = sc.nextBoolean();
        if(ansL){
            System.out.println("Give value : ");
            int val = sc.nextInt();
            Basic b = new Basic();
            node.left = b.new Node(val);
            helper(node.left, sc);
        }
        System.out.println("Do u want to add right " + node.val);
        boolean ansR = sc.nextBoolean();
        if(ansR){
            System.out.println("Give value : ");
            int val = sc.nextInt();
            Basic b = new Basic();
            node.right = b.new Node(val);
            helper(node.right, sc);
        }
        return;
    }

}
