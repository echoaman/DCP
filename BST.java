import java.util.Scanner;

public class BST {

    public static void main(String[] args) {   
        
        Scanner in = new Scanner(System.in);
        Node root = null;
        int val;

        System.out.println("enter -1 to stop");
        while(true){
            System.out.print("Enter node: ");
            val = in.nextInt();
            if(val == -1)
                break;
            
            root = formTree(root,val);
        }

        System.out.println();
        inorder(root);
        
    }    

    public static Node formTree(Node root, int val){
    
        if(root == null)
            return new Node(val);

        if(val > root.val)
            root.right = formTree(root.right, val);
        else
            root.left = formTree(root.left, val);

        return root;
    }

    public static void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

}

class Node{
    Node left;
    Node right;
    int val;

    public Node(int val){
        this.left = null;
        this.right = null;
        this.val = val;
    }
}