package mylib.datastructures.trees;

import mylib.datastructures.nodes.TNode;

public class AVL extends BST {

    //AVL TREE ALL FUNCTIONS

    //AVL TREE CONSTRUCTOR
    public AVL() {
        super();
    }

    // Overload constructor AVL(int val) which takes in an integer value, and creates a TNode and use it as root
    public AVL(int val) {
        super(val);
    }

    // Overload constructor AVL(TNode obj) which takes a TNode as an argument and use it as the root of the tree. If the TNode obj has children, the constructor needs to create a balanced tree from passed tree by one of the following methods:

    // • iteratively inserting nodes from the original tree and balancing the new created AVL tree
    // • implementing a full tree balancing algorithm (Bonus)

    public AVL(TNode obj){
        super(obj);
        if(obj.left != null){
            this.Insert(obj.left);
        }
        if(obj.right != null){
            this.Insert(obj.right);
        }
    }

    // insert(int data) : inserts the data passed as argument into the tree
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
                        node.parent = parent;
                        this.balanceTree(parent);
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = node;
                        node.parent = parent;
                        this.balanceTree(parent);
                        return;
                    }
                }
            }
        }
    }

    // insert(TNode node) : inserts the node passed as argument into the tree
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
                        node.parent = parent;
                        this.balanceTree(parent);
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = node;
                        node.parent = parent;
                        this.balanceTree(parent);
                        return;
                    }
                }
            }
        }
    }

    public void balanceTree(TNode node) {
        this.setBalance(node);
        int balance = node.balance;
        if (balance == -2) {
            if (this.height(node.left.left) >= this.height(node.left.right)) {
                node = this.rotateRight(node);
            } else {
                node = this.rotateLeftThenRight(node);
            }
        } else if (balance == 2) {
            if (this.height(node.right.right) >= this.height(node.right.left)) {
                node = this.rotateLeft(node);
            } else {
                node = this.rotateRightThenLeft(node);
            }
        }
        if (node.parent != null) {
            this.balanceTree(node.parent);
        } else {
            this.root = node;
        }
    }

    public TNode rotateLeft(TNode a) {
        TNode b = a.right;
        b.parent = a.parent;
        a.right = b.left;
        if (a.right != null) {
            a.right.parent = a;
        }
        b.left = a;
        a.parent = b;
        if (b.parent != null) {
            if (b.parent.right == a) {
                b.parent.right = b;
            } else if (b.parent.left == a) {
                b.parent.left = b;
            }
        }
        this.setBalance(a, b);
        return b;
    }

    public TNode rotateRight(TNode a) {
        TNode b = a.left;
        b.parent = a.parent;
        a.left = b.right;
        if (a.left != null) {
            a.left.parent = a;
        }
        b.right = a;
        a.parent = b;
        if (b.parent != null) {
            if (b.parent.right == a) {
                b.parent.right = b;
            } else if (b.parent.left == a) {
                b.parent.left = b;
            }
        }
        this.setBalance(a, b);
        return b;
    }

    public TNode rotateLeftThenRight(TNode n) {
        n.left = this.rotateLeft(n.left);
        return this.rotateRight(n);
    }

    public TNode rotateRightThenLeft(TNode n) {
        n.right = this.rotateRight(n.right);
        return this.rotateLeft(n);
    }

    public int height(TNode node) {
        if (node == null) {
            return -1;
        }
        if (node.left == null && node.right == null) {
            return 0;
        } else if (node.left == null) {
            return 1 + this.height(node.right);
        } else if (node.right == null) {
            return 1 + this.height(node.left);
        } else {
            return 1 + Math.max(this.height(node.left), this.height(node.right));
        }
    }

    public void setBalance(TNode... nodes) {
        for (TNode n : nodes) {
            this.reheight(n);
            n.balance = this.height(n.right) - this.height(n.left);
        }
    }

    public void reheight(TNode node) {
        if (node != null) {
            node.height = 1 + Math.max(this.height(node.left), this.height(node.right));
        }
    }

    //Setter and getter for root: the setter function must check if the node has children. If children are found it must do the same as the overload constructor.
    public TNode getRoot() {
        return this.root;
    }

    public void setRoot(TNode root) {
        this.root = root;
        if(root.left != null){
            this.Insert(root.left);
        }
        if(root.right != null){
            this.Insert(root.right);
        }
    }

    //Delete(int val): finds the node with val as data and deletes it, if not found prints a statement that the value is not in the tree (Bonus)
    public void Delete(int val) {
        if (this.root == null) {
            return;
        }
        TNode node = this.root;
        while (node != null) {
            if (val < node.data) {
                node = node.left;
            } else if (val > node.data) {
                node = node.right;
            } else {
                break;
            }
        }
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            if (node.parent == null) {
                this.root = null;
            } else {
                TNode parent = node.parent;
                if (parent.left == node) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
                this.balanceTree(parent);
            }
            return;
        }
        if (node.left == null) {
            if (node.parent == null) {
                this.root = node.right;
            } else {
                TNode parent = node.parent;
                node.right.parent = parent;
                if (parent.left == node) {
                    parent.left = node.right;
                } else {
                    parent.right = node.right;
                }
                this.balanceTree(parent);
            }
            return;
        }
        if (node.right == null) {
            if (node.parent == null) {
                this.root = node.left;
            } else {
                TNode parent = node.parent;
                node.left.parent = parent;
                if (parent.left == node) {
                    parent.left = node.left;
                } else {
                    parent.right = node.left;
                }
                this.balanceTree(parent);
            }
            return;
        }
        TNode child = node.right;
        while (child.left != null) {
            child = child.left;
        }
        node.data = child.data;
        if (child.parent.left == child) {
            child.parent.left = child.right;
        } else {
            child.parent.right = child.right;
        }
        if (child.right != null) {
            child.right.parent = child.parent;
        }
        this.balanceTree(child.parent);
    }

    //TNode Search(int val): inherited from parent class
    
    public TNode Search(int val) {
        TNode node = this.root;
        while (node != null) {
            if (val < node.data) {
                node = node.left;
            } else if (val > node.data) {
                node = node.right;
            } else {
                return node;
            }
        }
        return null;
    }

    //printInOrder(): inherited from parent
    public void printInOrder() {
        this.printInOrder(this.root);
    }

    public void printInOrder(TNode node) {
        if (node != null) {
            this.printInOrder(node.left);
            System.out.println(node.data);
            this.printInOrder(node.right);
        }
    }

    //printBF(): inherited from parent
    public void printBF() {
        this.printBF(this.root);
    }

    public void printBF(TNode node) {
        if (node != null) {
            this.printBF(node.left);
            System.out.println(node.balance);
            this.printBF(node.right);
        }
    }

    public void PreOrder(TNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            PreOrder(root.left);
            PreOrder(root.right);
        }
    }

    public void InOrder(TNode root) {
        if (root != null) {
            InOrder(root.left);
            System.out.print(root.data + " ");
            InOrder(root.right);
        }
    }
}