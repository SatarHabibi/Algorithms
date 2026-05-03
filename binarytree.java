public class binarytree{

    public void main(String []args)
    {
bsttree obj=new bsttree();
obj.insert(20);
obj.insert(30);
obj.insert(15);
obj.insert(35);
obj.insert(17);
obj.insert(25);
obj.insert(10);
obj.insert(20);
obj.preorder();
obj.postorder();
obj.inorder();


    }
}
class Node {
int data;
Node leftNode;
Node rightNode;

Node(int data)
{

    this.data=data;
    leftNode=null;
    rightNode=null;

}
}
class bsttree{
Node root;
void insert(int data)
{
    root=insertrec(root,data);
}

Node insertrec(Node root, int data)
{
    if(root==null)
    {
        root=new Node(data);
    }else if(data<root.data)
    {
     root.leftNode=insertrec(root.leftNode,data);   
    }else if(data>root.data)
    {
        root.rightNode=insertrec(root.rightNode,data);
    }

return root;
}

 public void inorder()
{

    inorderrec(root);
    System.out.println();
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


    void preorder()
    {
        preorderrec(root);
        System.out.print("\n");
    }
    void preorderrec(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.data+" ");
            preorderrec(root.leftNode);
            preorderrec(root.rightNode);

        }
    }

    void postorder()
    {
        postorderrec(root);
        System.out.println();
        }
    void postorderrec(Node root)
    {
        if(root!=null)
        {
            postorderrec(root.leftNode);
            postorderrec(root.rightNode);
            System.out.print(root.data+" ");
        }
    }
   }


