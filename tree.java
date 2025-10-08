package lec2;
import java.util.*;
public class tree{
    Scanner sc = new Scanner(System.in);
    public class Node{
        int data;
        Node left;
        Node right;
        public Node(){

        }
         public  Node(int val){
        this.data = val;
    }
   
    }
     private Node root;
    public void createTree(){
        this.root= createTree(root);
    }
    private Node createTree(Node root){
        int val = sc.nextInt();
        Node nn = new Node();
        nn.data = val;
        boolean hlc = sc.nextBoolean();
        if(hlc==true){
            nn.left = createTree(nn);
    }
        boolean rlc = sc.nextBoolean();
        if(rlc==true){
            nn.right = createTree(nn);
    }

        return nn;
    }
//PREORDER
    public void preorder(){
        preorder(this.root);
    }
    private void preorder(Node root){
        if(root ==null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

//POSTORDER
     public void postorder(){
        postorder(this.root);
    }
    private void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }

    //INORDER
      public void inorder(){
        inorder(this.root);
    }
    private void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
        
    }
    public int Findmax(Node root){
        if(root == null){
            return -1;
        }
        int val = root.data;
        int leftm = Findmax(root.left);
        int rightm = Findmax(root.right);
        return Math.max(val,Math.max(leftm,rightm));
    }

    public static void main(String[] args) {
        tree t = new tree();
        t.createTree();
        t.preorder();
        t.postorder();
        t.inorder();
        System.out.println("MAX = "+t.Findmax(t.root));
    }
   
}