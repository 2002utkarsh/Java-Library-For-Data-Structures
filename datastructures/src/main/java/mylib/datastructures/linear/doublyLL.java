package mylib.datastructures.linear;
import mylib.datastructures.nodes.DNode;
public class doublyLL {
    //doubly linked list insert at head using dnode class
    protected DNode head;
    protected DNode tail;
    protected int size;

    public doublyLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public doublyLL(DNode head) {
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

    //Sort
    public void Sort() {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
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


    //SORT INSERT
    public void SortedInsert(DNode node) {
        if (head == null) {
            head = node;
            tail = node;
            size++;
            return;
        }
        if (node.data < head.data) {
            InsertHead(node);
            return;
        }
        if (node.data > tail.data) {
            InsertTail(node);
            return;
        }
        DNode curr = head;
        while (curr.next != null && curr.next.data < node.data) {
            curr = curr.next;
        }
        node.next = curr.next;
        curr.next = node;
        size++;
    }

    public void Print() {
        DNode curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    //DELETE AT HEAD
    public void DeleteHead() {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        head = head.next;
        size--;
    }
    //DELETE AT TAIL
    public void DeleteTail() {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        DNode curr = head;
        while (curr.next != tail) {
            curr = curr.next;
        }
        curr.next = null;
        tail = curr;
        size--;
    }

    //DELETE NODE IF IT IS THERE IN THE LIST
    public void Delete(DNode node) {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        if (head.data == node.data) {
            DeleteHead();
            return;
        }
        if (tail.data == node.data) {
            DeleteTail();
            return;
        }
        DNode curr = head;
        while (curr.next != null && curr.next.data != node.data) {
            curr = curr.next;
        }
        if (curr.next == null) {
            throw new IndexOutOfBoundsException("Node not found");
        }
        curr.next = curr.next.next;
        size--;
    }

    //DELETE ALL
    public void Clear() {
        head = null;
        tail = null;
        size = 0;
    }

    //Search
    public DNode Search(DNode node) {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        DNode curr = head;
        while (curr != null) {
            if (curr == node) {
                return curr;
            }
            curr = curr.next;
        }
        return null;
    }

}
