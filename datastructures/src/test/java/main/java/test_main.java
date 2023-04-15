package main.java;


 
import mylib.datastructures.linear.*;
import mylib.datastructures.nodes.*;
import mylib.datastructures.trees.*;


public class test_main {
    // writing all test cases here

    public static void main(String[] args) {
        // TESTING ALL FUNCTION OF SLL CLASS
        SLL list = new SLL();
        System.out.println();
        System.out.println("TESTING SINGLY LINKED LIST CLASS");
        System.out.println("--------------------------------------");
        System.out.println();
        System.out.println("TESTING INSERT HEAD, INSERT TAIL, AND INSERT POSITON FUNCTIONS");
        list.InsertHead(new DNode(1));
        list.InsertHead(new DNode(2));
        list.InsertHead(new DNode(3));
        list.InsertTail(new DNode(10));
        list.InsertTail(new DNode(185));
        list.InsertTail(new DNode(100));
        list.Insert(new DNode(20), 3);
        list.Print();
        System.out.println();

        System.out.println("TESTING DELETE HEAD FUNCTION");
        list.DeleteHead();
        list.Print();
        System.out.println();

        System.out.println("TESTING DELETE TAIL FUNCTION");
        list.DeleteTail();
        list.Print();
        System.out.println();

        System.out.println("TESTING DELETE NODE '3' FUNCTION");
        list.Delete(new DNode(20));
        list.Print();
        System.out.println();

        System.out.println("TESTING SEARCH FUNCTION");
        System.out.println("SEARCHING FOR NODE WITH DATA 10");
        list.Search(new DNode(10));
        System.out.println();

        System.out.println("TESTING SORT FUNCTION");
        list.Sort();
        list.Print();
        System.out.println();

        System.out.println("TESTING SORTED INSERT FUNCTION");
        list.SortedInsert(new DNode(5));
        list.Print();
        System.out.println();

        list.Clear();
        System.out.println("TESTING CLEAR FUNCTION");
        list.Print();
        System.out.println();

        System.out.println("TESTING INSERT After clear FUNCTION");

        list.InsertHead(new DNode(2023));
        list.InsertHead(new DNode(2024));
        list.Print();

        System.out.println("++++++++++++++++++++++++++++++++++++++");

        System.out.println();
        System.out.println();

        System.out.println("TESTING DOUBLY LINKED LIST CLASS");
        System.out.println("--------------------------------------");

        // TEST ALL FUNCTIONS OF DLL CLASS
        doublyLL list2 = new doublyLL();
        System.out.println();
        System.out.println("TESTING INSERT HEAD, INSERT TAIL, AND INSERT POSITON FUNCTIONS");
        list2.InsertHead(new DNode(1));
        list2.InsertHead(new DNode(2));
        list2.InsertHead(new DNode(3));
        list2.InsertTail(new DNode(10));
        list2.InsertTail(new DNode(185));
        list2.InsertTail(new DNode(100));
        list2.Insert(new DNode(20), 3);
        list2.Print();
        System.out.println();

        System.out.println("TESTING DELETE HEAD FUNCTION");
        list2.DeleteHead();
        list2.Print();
        System.out.println();

        System.out.println("TESTING DELETE TAIL FUNCTION");
        list2.DeleteTail();
        list2.Print();
        System.out.println();

        System.out.println("TESTING DELETE NODE '185' FUNCTION");
        list2.Delete(new DNode(185));
        list2.Print();
        System.out.println();

        System.out.println("TESTING SEARCH FUNCTION");
        System.out.println("SEARCHING FOR NODE WITH DATA 10");
        list2.Search(new DNode(10));
        System.out.println();
        
        System.out.println("TESTING SORT FUNCTION");
        list2.Sort();
        list2.Print();
        System.out.println();
       
        System.out.println("TESTING SORTED INSERT FUNCTION");
        list2.SortedInsert(new DNode(5));
        list2.Print();
        System.out.println();

        list2.Clear();
        System.out.println("TESTING CLEAR FUNCTION");
        list2.Print();
        System.out.println();

        System.out.println("TESTING INSERT After clear FUNCTION");
        list2.InsertHead(new DNode(203));
        list2.InsertHead(new DNode(224));
        list2.Print();


        System.out.println("++++++++++++++++++++++++++++++++++++++");

        System.out.println();
        System.out.println();
        System.out.println("TESTING CIRCULAR SINGLY LINKED LIST CLASS");
        System.out.println("--------------------------------------");

        // TEST ALL FUNCTIONS OF CLL CLASS
        CSLL list3 = new CSLL();
        System.out.println();

        System.out.println("TESTING INSERT HEAD, INSERT TAIL, AND INSERT POSITON FUNCTIONS");
        list3.InsertHead(new DNode(4));
        list3.InsertHead(new DNode(15));
        list3.InsertHead(new DNode(5448));
        list3.InsertTail(new DNode(19));
        list3.InsertTail(new DNode(185));
        list3.InsertTail(new DNode(10));
        list3.Insert(new DNode(28), 3);
        list3.Print();
        System.out.println();

        System.out.println("TESTING DELETE HEAD FUNCTION");
        list3.DeleteHead();
        list3.Print();
        System.out.println();

        System.out.println("TESTING DELETE TAIL FUNCTION");
        list3.DeleteTail();
        list3.Print();
        // sss

        // System.out.println("TESTING DELETE NODE '5448' FUNCTION");
        // list3.Delete(new DNode(19));
        // list3.Print();
        // System.out.println();

        System.out.println("TESTING SEARCH FUNCTION");
        System.out.println("SEARCHING FOR NODE WITH DATA 10");
        list3.Search(new DNode(10));
        System.out.println();

        // System.out.println("Testing Search Function with a node that is not in the list");
        // System.out.println("SEARCHING FOR NODE WITH DATA 100");
        // list3.Search(new DNode(100));                           ////////ERROR
        // System.out.println();


        System.out.println("TESTING SORT FUNCTION");
        list3.Sort();
        list3.Print();
        System.out.println();

        System.out.println("TESTING SORTED INSERT FUNCTION");
        list3.SortedInsert(new DNode(5));
        list3.Print();
        System.out.println();

        System.out.println("TESTING CLEAR FUNCTION");
        list3.Clear();
        // list3.Print();
        System.out.println();

        System.out.println("TESTING INSERT '53, 84' After clear FUNCTION");
        list3.InsertHead(new DNode(53));
        list3.InsertHead(new DNode(84));
        list3.Print();


        System.out.println("++++++++++++++++++++++++++++++++++++++");

        System.out.println();
        System.out.println();
        System.out.println("TESTING CIRCULAR DOUBLY LINKED LIST CLASS");
        System.out.println("--------------------------------------");

        // TEST ALL FUNCTIONS OF CDLL CLASS
        DCLL list4 = new DCLL();
        System.out.println();

        System.out.println("TESTING INSERT HEAD, INSERT TAIL, AND INSERT POSITON FUNCTIONS");
        list4.InsertHead(new DNode(4));
        list4.InsertHead(new DNode(15));
        list4.InsertHead(new DNode(5448));
        list4.InsertTail(new DNode(19));
        list4.InsertTail(new DNode(185));
        list4.InsertTail(new DNode(10));
        list4.Insert(new DNode(28), 3);
        list4.Print();
        System.out.println();

        System.out.println("TESTING DELETE HEAD FUNCTION");
        list4.DeleteHead();
        list4.Print();
        System.out.println();

        System.out.println("TESTING DELETE TAIL FUNCTION");
        list4.DeleteTail();
        list4.Print();
        System.out.println();

        System.out.println("TESTING DELETE NODE '3' FUNCTION");
        System.out.println("ERROR: DELETE NODE FUNCTION IS NOT WORKING");
        // list4.Delete(new DNode(3));
        // list4.Print();
        System.out.println();

        System.out.println("TESTING SEARCH FUNCTION");
        System.out.println("SEARCHING FOR NODE WITH DATA 10");
        System.out.println(list4.Search(new DNode(10)));
        System.out.println();

        // System.out.println("TESTING SORT FUNCTION");
        // list4.Sort();
        // list4.Print();
        // System.out.println();

        System.out.println("TESTING SORTED INSERT '52' FUNCTION");
        list4.SortedInsert(new DNode(52));
        list4.Print();
        System.out.println();

        System.out.println("TESTING CLEAR FUNCTION");
        list4.Clear();
        System.out.println();

        System.out.println("TESTING INSERT '53, 84' After clear FUNCTION");
        list4.InsertHead(new DNode(53));
        list4.InsertHead(new DNode(84));
        list4.Print();

        System.out.println("++++++++++++++++++++++++++++++++++++++");

        System.out.println();
        System.out.println();
        System.out.println("TESTING STACK CLASS");
        System.out.println("--------------------------------------");

        // TEST ALL FUNCTIONS OF STACK CLASS
        LLStack stack = new LLStack();
        System.out.println();

        System.out.println("TESTING PUSH FUNCTION");
        stack.Push(new DNode(4));
        stack.Push(new DNode(15));
        stack.Push(new DNode(5448));
        stack.Push(new DNode(19));
        stack.Push(new DNode(185));
        stack.Push(new DNode(10));
        stack.Push(new DNode(28));
        // stack.InsertHead(new DNode(15));
        stack.Print();
        System.out.println();

        System.out.println("TESTING POP FUNCTION");
        stack.Pop();
        stack.Print();
        System.out.println();

        System.out.println("TESTING PEEK FUNCTION");
        System.out.println(stack.Peek());
        System.out.println();

        System.out.println("TESTING CLEAR FUNCTION");
        stack.Clear();
        stack.Print();
        System.out.println();

        System.out.println("Testing Clear Function after clear");
        stack.Clear();
        stack.Print();
        System.out.println();

        System.out.println("TESTING PUSH '35, 478' After clear FUNCTION");
        stack.Push(new DNode(35));
        stack.Push(new DNode(478));
        stack.Print();


        System.out.println("++++++++++++++++++++++++++++++++++++++");

        System.out.println();
        System.out.println();
        System.out.println("TESTING QUEUE CLASS");
        System.out.println("--------------------------------------");

        // TEST ALL FUNCTIONS OF QUEUE CLASS
        LLQueue queue = new LLQueue();
        System.out.println();

        System.out.println("TESTING ENQUEUE FUNCTION");
        queue.Enqueue(new DNode(4));
        queue.Enqueue(new DNode(15));
        queue.Enqueue(new DNode(5448));
        queue.Enqueue(new DNode(19));
        queue.Enqueue(new DNode(185));
        queue.Enqueue(new DNode(10));
        queue.Enqueue(new DNode(28));
        queue.Print();
        System.out.println();

        System.out.println("TESTING DEQUEUE FUNCTION");
        queue.Dequeue();
        queue.Print();
        System.out.println();

        System.out.println("TESTING PEEK FUNCTION");
        System.out.println(queue.Peek());
        System.out.println();

        // toString() 
        System.out.println("TESTING TOSTRING FUNCTION");
        System.out.println(queue.toString());
        System.out.println();

        System.out.println("TESTING CLEAR FUNCTION");
        queue.Clear();
        queue.Print();
        System.out.println();

        System.out.println("Testing Enqueue Function after clear");
        queue.Enqueue(new DNode(4));
        queue.Enqueue(new DNode(15));
        queue.Print();

        System.out.println("++++++++++++++++++++++++++++++++++++++");

        System.out.println();
        System.out.println();
        System.out.println("TESTING BINARY SEARCH TREE CLASS");
        System.out.println("--------------------------------------");


        BST bst = new BST();

        // insert some nodes
        bst.Insert(5);
        bst.Insert(3);
        bst.Insert(7);
        bst.Insert(1);
        bst.Insert(9);
        bst.Insert(2);

        // test the getRoot method
        System.out.println("Root: " + bst.getRoot().data);

        // test the search method
        TNode node = bst.search(7);
        if (node != null) {
            System.out.println("Found node with value 7");
        } else {
            System.out.println("Node with value 7 not found");
        }

        // test deleting a node with no children
        bst.Delete(2);

        // test deleting a node with one child
        bst.Delete(1);

        // test deleting a node with two children
        bst.Delete(5);

        // test deleting a node that does not exist
        bst.Delete(10);

        // print the tree in-order
        System.out.print("In-order traversal: ");
        bst.printInOrder();
        System.out.println();


        System.out.println();
        System.out.println();
        System.out.println("TESTING AVL TREE CLASS");
        System.out.println("--------------------------------------");


        AVL tree = new AVL();

        // Testing insert() method with integer values
        tree.Insert(10);
        tree.Insert(20);
        tree.Insert(30);
        tree.Insert(40);
        tree.Insert(50);
        tree.Insert(25);



        // Testing insert() method with TNode objects
        TNode node1 = new TNode(60);
        TNode node2 = new TNode(70);
        TNode node3 = new TNode(80);
        tree.Insert(node1);
        tree.Insert(node2);
        tree.Insert(node3);

        System.out.println();
        System.out.println("Root: " + tree.root.data);
        System.out.println();
        // Printing out the tree in-order traversal
        System.out.println("In-order traversal of the AVL tree:");
        tree.InOrder(tree.root);

        // Testing the balance factor of each node
        System.out.println("Balance factor of each node:");
        tree.PreOrder(tree.root);

        // Testing the height of the tree
        System.out.println("Height of the AVL tree: " + tree.height(tree.root));

        // Testing search() method
        TNode searchResult = tree.search(30);
        System.out.println("Node found: " + searchResult.data);

        // Testing delete() method
        tree.Delete(20);
        System.out.println("In-order traversal after deleting 20:");
        tree.InOrder(tree.root);
    





    }
}
