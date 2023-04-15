package mylib.datastructures.linear;

import mylib.datastructures.nodes.DNode;

public class SLL {
 protected DNode head;
    protected DNode tail;
    protected int size;

    public SLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public SLL(DNode head) {
        this.head = head;
        this.tail = head;
        this.size = 1;
    }

    public void InsertHead(DNode node) {
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;

        //might have to add else as well
    }

    public void InsertTail(DNode node) {
        if (tail == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void Insert(DNode node, int position) {
        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        if (position == 0) {
            InsertHead(node);
        } else if (position == size) {
            InsertTail(node);
        } else {
            DNode prev = getNode(position - 1);
            node.next = prev.next;
            prev.next = node;
            size++;
        }
    }

    private DNode getNode(int position) {
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        DNode curr = head;
        for (int i = 0; i < position; i++) {
            curr = curr.next;
        }
        return curr;
    }


    public DNode Search(DNode node){
        DNode curr = head;
        while(curr != null){
            if(curr.data == node.data){
                return curr;
            }
            curr = curr.next;
        }
        return null;
    }

    //Delete
    public void DeleteHead() {
        if (head == null) {
            throw new IndexOutOfBoundsException("Empty list");
        }
        head = head.next;
        size--;
    }

    public void DeleteTail() {
        if (head == null) {
            throw new IndexOutOfBoundsException("Empty list");
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            DNode curr = head;
            while (curr.next != tail) {
                curr = curr.next;
            }
            curr.next = null;
            tail = curr;
        }
        size--;
    }

  //delete node
    public void Delete(DNode node) {
        if (head == null) {
            throw new IndexOutOfBoundsException("Empty list");
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else if (head.data == node.data) {
            DeleteHead();
        } else if (tail.data == node.data) {
            DeleteTail();
        } else {
            DNode curr = head;
            while (curr.next.data != node.data && curr.next != null) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }
        size--;
    }

    //sorted insert
    public void SortedInsert(DNode node) {
        if (head == null) {
            head = node;
            tail = node;
            size++;
        } else if (node.data < head.data) {
            InsertHead(node);
        } else if (node.data > tail.data) {
            InsertTail(node);
        } else {
            DNode curr = head;
            while (curr.next != null && curr.next.data < node.data) {
                curr = curr.next;
            }
            node.next = curr.next;
            curr.next = node;
            size++;
        }
    }

    //issorted
    // public boolean isSorted() {
    //     if (head == null) {
    //         return true;
    //     }
    //     DNode curr = head;
    //     while (curr.next != null) {
    //         if (curr.data > curr.next.data) {
    //             return false;
    //         }
    //         curr = curr.next;
    //     }
    //     return true;
    // }

    // sort
    public void Sort() {
        if (head == null) {
            return;
        }
        DNode curr = head;
        while (curr != null) {
            DNode next = curr.next;
            while (next != null) {
                if (curr.data > next.data) {
                    int temp = curr.data;
                    curr.data = next.data;
                    next.data = temp;
                }
                next = next.next;
            }
            curr = curr.next;
        }
    }

    //pritn
    public void Print() {
        DNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public void Clear(){
        head = null;
        tail = null;
        size = 0;
    }

}
