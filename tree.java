public class tree{
    public static void main(String[] args) {
bstree obj=new bstree();
obj.insert(10);
obj.insert(20);     
obj.insert(15);
obj.insert(8);
obj.insert(5);         
obj.inorder();
obj.postorder();
obj.preorder();
        
    }

}
class Node{
    Node leftNode;
    Node rightNode;
    int data;
    Node(int data)
    {
        this.data=data;
        leftNode=rightNode=null;
    }
}
class bstree{
    Node root;
    public void insert(int data)
    {
    root=insertrec(root, data);
    }
    public Node insertrec(Node root, int data)
    {
if(root==null)
{
    root=new Node(data);
    return root;
}else if(data<root.data)
{
    root.leftNode=insertrec(root.leftNode, data);
}else if(data>root.data)
{
    root.rightNode=insertrec(root.rightNode,data);
}
return root;
    }
    void inorder()
    {
        inorderrec(root);
        System.out.println("\n");
    }
    void inorderrec(Node root)
    {
        if(root!=null)
        {
            inorderrec(root.leftNode);
            System.out.print(root.data+" ");
            inorderrec(root.rightNode);
        }
    }
    public void postorder()
    {
        postorderrec(root);
        System.out.println("\n");
    }
public void postorderrec(Node root)
{
    if(root!=null)
    {
        postorderrec(root.leftNode);
        postorderrec(root.rightNode);
        System.out.print(root.data+" ");
    }
}
public void preorder()
{
    preorderrec(root);
}
public void preorderrec(Node root)
{
    if(root!=null)
    {
        System.out.print(root.data+" ");
        preorderrec(root.leftNode);
        preorderrec(root.rightNode);
    }
}
}