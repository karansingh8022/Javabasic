import java.util.*;

public class Main{
    static int idx = 0;
    
    static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    static class BinaryTree{
        public static Node buildTree(int nodes[]){
            if(nodes[idx] == -1)
            return null;
            
            Node root = new Node(nodes[idx++]);
            root.left = buildTree(nodes);
            root.right = buildTree(nodes);
            
            idx++;
            
            if(idx == nodes.length)
            return root;
            
            return root;
        }
    }
    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
    }
}