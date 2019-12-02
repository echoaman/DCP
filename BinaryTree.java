import java.util.Scanner;

public class BinaryTree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter root: ");
        Node root = new Node(in.nextInt());
        System.out.println("Enter -1 for no child");
        root = getTree(root,in);
        inorder(root);
    }

    public static Node getTree(Node root, Scanner in){
        System.out.print("Enter left child of " + root.val + ": ");
        int val = in.nextInt();
        if(val != -1){
            root.left = new Node(val);
            getTree(root.left, in);
        }

        System.out.print("Enter right child of " + root.val + ": ");
        val = in.nextInt();
        if(val != -1){
            root.right = new Node(val);
            getTree(root.right, in);
        }

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
