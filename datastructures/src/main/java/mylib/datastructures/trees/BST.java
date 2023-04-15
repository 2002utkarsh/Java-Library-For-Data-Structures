package mylib.datastructures.trees;
import mylib.datastructures.nodes.TNode;

import java.util.LinkedList;
import java.util.Queue;



public class BST {
   
    // root of the tree
    public TNode root;

    public BST() {
        this.root = null;
    }

    //Overload constructor BST(int val) which takes in an integer value, and creates a TNode and use it as root
    public BST(int val) {
        this.root = new TNode(val);
    }

    //Overload constructor BST(TNode obj) which takes in a TNode, and use it as root
    public BST(TNode obj) {
        this.root = obj;
    }

    public TNode getRoot() {
        return this.root;
    }

    public void setRoot(TNode node) {
        this.root = node;
    }

    public void Insert(int data) {
        TNode node = new TNode(data);
        if (this.root == null) {
            this.root = node;
        } else {
            TNode current = this.root;
            TNode parent = null;
            while (true) {
                parent = current;
                if (data < current.data) {
                    current = current.left;
                    if (current == null) {
                        parent.left = node;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = node;
                        return;
                    }
                }
            }
        }
    }

    //Insert(TNode node) : inserts the node passed as argument into the tree
    public void Insert(TNode node) {
        if (this.root == null) {
            this.root = node;
        } else {
            TNode current = this.root;
            TNode parent = null;
            while (true) {
                parent = current;
                if (node.data < current.data) {
                    current = current.left;
                    if (current == null) {
                        parent.left = node;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = node;
                        return;
                    }
                }
            }
        }
    }

    //Delete(int val): finds the node with val as data and deletes it, if not found prints a statement that the value is not in the tree
    public void Delete(int val) {
        TNode current = this.root;
        TNode parent = this.root;
        boolean isLeftChild = false;
        if (current == null) {
            System.out.println("Tree is empty");
            return;
        }
        while (current.data != val) {
            parent = current;
            if (current.data > val) {
                isLeftChild = true;
                current = current.left;
            } else {
                isLeftChild = false;
                current = current.right;
            }
            if (current == null) {
                System.out.println("Value not found");
                return;
            }
        }
        // if i am here that means we have found the node
        // Case 1: if node to be deleted has no children
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            }
            if (isLeftChild == true) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        }
        // Case 2 : if node to be deleted has only one child
        else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        } else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        } else if (current.left != null && current.right != null) {

            // now we have found the minimum element in the right sub tree
            TNode successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }
    }

    public TNode getSuccessor(TNode deleleNode) {
        TNode successsor = null;
        TNode successsorParent = null;
        TNode current = deleleNode.right;
        while (current != null) {
            successsorParent = successsor;
            successsor = current;
            current = current.left;
        }
        // check if successor has the right child, it cannot have left child for sure
        // if it does have the right child, add it to the left of successorParent.
        // successsorParent
        if (successsor != deleleNode.right) {
            successsorParent.left = successsor.right;
            successsor.right = deleleNode.right;
        }
        return successsor;
    }

    // TNode Search(int val): searches for the node with val as data and returns it or returns null if not found.
    public TNode search(int val) {
        TNode current = this.root;
        while (current != null) {
            if (current.data == val) {
                return current;
            } else if (current.data > val) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return null;
    }

    // printInOrder(): prints the content data of the tree in ascending order
    public void printInOrder() {
        printInOrder(this.root);
    }

    public void printInOrder(TNode node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.print(node.data + " ");
            printInOrder(node.right);
        }
    }

    // printBF(): prints the content of the tree in Breadth-First order, each level of the tree will be printed on a separate line
    public void printBF() {
        Queue<TNode> queue = new LinkedList<TNode>();
        queue.add(this.root);
        while (!queue.isEmpty()) {
            TNode tempNode = queue.poll();
            System.out.print(tempNode.data + " ");
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

    

}