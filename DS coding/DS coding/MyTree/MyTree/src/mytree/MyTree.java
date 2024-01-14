/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytree;

/**
 *
 * @author Anthony
 */
//import java.util.LinkedList<E>;
import java.math.*;
public class MyTree {

    /**
     * @param args the command line arguments
     */
    
 public static Node root;
public int height;
public Node node;
public int value;

    

public void insert(int value)
{
node = new Node(value);
if (root == null)
{
root = node;
return;
}
insertRec(root, node);
height = this.heightOfBinaryTree(root);

}  // end of insert

// compare to 
public int compareTo(int a)
{
if (this.value == a)
return 0;
else if (this.value > a)
return 1;
else
return -1;
}
    // end of compare to

/**
* Inserts a new node by recursively working down the sub-trees
*/
private void insertRec(Node latestRoot, Node node)
{
if ((int)latestRoot.value > (int)node.value)
{
if (latestRoot.left == null)
{
latestRoot.left = node;
return;
}
else
{
insertRec(latestRoot.left, node);
}
}
else
{
if (latestRoot.right == null)
{
latestRoot.right = node;
return;
}
else
{
insertRec(latestRoot.right, node);
}
}
}


//Works out how many levels the Binary Search Tree has

public int heightOfBinaryTree(Node node)
{
if (node == null)
{
return 0;
}
else
{
return 1 + Math.max(heightOfBinaryTree(node.left),
heightOfBinaryTree(node.right));
//Math.max(value, value;
}
}
/**
* Returns the minimum value in the Binary Search Tree
*/
public int findMinimum()
{
if (root == null)
{
return 0;
}
Node currNode = root;
while (currNode.left != null)
{
currNode = currNode.left;
}
return currNode.value;
}
/**
* Returns the maximum value in the Binary Search Tree
*/
public int findMaximum()
{
if (root == null)
{
return 0;
}
Node currNode = root;
while (currNode.right != null)
{
currNode = currNode.right;
}
return currNode.value;
}
/**
* Prints the contents of the tree in an in-order way
*/
public String printInOrder()
{
return printInOrderRec(root);
}


/*Helper method to recursively print the contents in an in-order way
*/
private String printInOrderRec(Node currRoot)
{
if (currRoot == null)
{
return "";
}
return printInOrderRec(currRoot.left) +
currRoot.value + ", " + printInOrderRec(currRoot.right);
}
/**
* Prints the contents of the tree in a pre-order way
*/
public String printPreOrder()
{
return printPreOrderRec(root);
}
/**
* Helper method to recursively print the contents in a pre-order way
*/
private String printPreOrderRec(Node currRoot)
{
if (currRoot == null)
{
return "";
}
return currRoot.value + ", " +
printPreOrderRec(currRoot.left) +
printPreOrderRec(currRoot.right);
}
/**
* Prints the contents of the tree in a post-order way
*/
public String printPostOrder()
{
return printPostOrderRec(root);
}
/**
* Helper method to recursively print the contents in a post-order way
*/
private String printPostOrderRec(Node currRoot)
{
if (currRoot == null)
{
return "";
}
return printPostOrderRec(currRoot.left) +
printPostOrderRec(currRoot.right) + currRoot.value + ", ";
}

/*Prints the contents of the tree in a level-order wa
/**
* Helper method to recursively print the contents in a level-order way
*/
/*
private String printLevelOrderRec(Node root)
{
//http://www.everybrickmatters.com/2013/10/level-order-traversal-of-binary-search.html 
//return if tree is empty or leaf node
    
String res="";
if (root == null)
{
System.out.println("tree is empty");
return "";
}
java.util.linkedList<Node> que = new java.util.linkedList<Node>();
//inserting root node
que.push(root);
while (!que.isEmpty())
{
//printing node and then inserting its child nodes if exist
root = que.removeFirst();
res = res + root.value + ", ";
if (root.left ! = null)
{
que.add(root.left);
}
if (root.right ! = null)
{
que.add(root.right);
}
}
return res;
}
*/
public static void main(String[] args) {
        // TODO code application logic here
    
        MyTree testTree = new MyTree();
        testTree.insert(10);
        testTree.insert(34);
        testTree.insert(2);
        testTree.insert(56);
        testTree.insert(1);
        
       // testTree.printPreOrder();
       // testTree.printInOrder();
       // testTree.printPostOrder();
        System.out.println(testTree.printInOrderRec(root));
        System.out.println(testTree.printPreOrderRec(root));
        System.out.println(testTree.printPostOrderRec(root));
        System.out.println("Draw the tree on paper and use this example to check each traverse option");
    }
     
public class Node
{
public int value;
public Node left;
public Node right;
public Node(int value)
{
this.value = value;
}
} // end of Node
     
     
} // end of class