package mylib.datastructures.linear;
import mylib.datastructures.nodes.DNode;
public class CSLL extends SLL {

    public CSLL() {
        super();
    }

    // second constructor for circular singly linked list
    public CSLL(DNode head) {
        this.head = head;
        this.tail = head;
        head.SetNext(head);
        size = 1;
    }

    @Override
    public void InsertHead(DNode node) {
        super.InsertHead(node);
        this.tail.SetNext(this.head);
    }

    @Override
    public void InsertTail(DNode node) {
        super.InsertTail(node);
        this.tail.SetNext(this.head);
    }

    @Override
    public void Insert(DNode node, int position) {
        super.Insert(node, position);
        this.tail.SetNext(this.head);
    }

    public void DeleteHead() {
        if (this.head == null) {
            throw new NullPointerException("List is empty");
        }
        this.head = this.head.GetNext();
        this.tail.SetNext(this.head);
        size--;
    }

    //override Search method
    @Override
    public DNode Search(DNode node) {
        if (this.head == null) {
            throw new NullPointerException("List is empty");
        }
        DNode curr = this.head;
        while (curr.GetNext() != this.head) {
            if (curr.data == node.data) {
                return curr;
            }
            curr = curr.GetNext();
        }
        if (curr.data == node.data) {
            return curr;
        }
        return null;
    }

    public void DeleteTail() {
        if (this.head == null) {
            throw new NullPointerException("List is empty");
        }
        DNode curr = this.head;
        while (curr.GetNext() != this.tail) {
            curr = curr.GetNext();
        }
        curr.SetNext(this.head);
        this.tail = curr;
        size--;
    }

    public void Delete(DNode node) {
        if (this.head == null) {
            throw new NullPointerException("List is empty");
        }
        DNode curr = this.head;
        while (curr.GetNext().data != node.data && curr.GetNext() != this.head) {
            curr = curr.GetNext();
            System.out.println("CURRENTDATA: "+curr.data);
        }
        curr.SetNext(node.GetNext());
        
        size--;

    }

    //override sort
    @Override
    public void Sort() {
        if (this.head == null) {
            throw new NullPointerException("List is empty");
        }
        DNode curr = this.head;
        DNode min = curr;
        DNode temp = null;
        while (curr.GetNext() != this.head) {
            min = curr;
            temp = curr.GetNext();
            while (temp != this.head) {
                if (temp.data < min.data) {
                    min = temp;
                }
                temp = temp.GetNext();
            }
            int tempData = curr.data;
            curr.data = min.data;
            min.data = tempData;
            curr = curr.GetNext();
        }
    }

    //override clear
    @Override
    public void Clear() {
        this.head = null;
        this.tail = null;
        size = 0;
    }

    //override print
    @Override
    public void Print() {
        if (this.head == null) {
            throw new NullPointerException("List is empty");
        }
        

        DNode curr = this.head;
        while (curr!=null) {
            System.out.print(curr.data + " ");
            curr = curr.GetNext();
            if(curr==this.head){
                break;
            }
        }
        System.out.println(curr.data);
    }


    //override sortedInsert
    @Override
    public void SortedInsert(DNode node) {
        if (this.head == null) {
            throw new NullPointerException("List is empty");
        }
        DNode curr = this.head;
        while (curr.GetNext() != this.head) {
            if (curr.data < node.data && curr.GetNext().data > node.data) {
                node.SetNext(curr.GetNext());
                curr.SetNext(node);
                size++;
                return;
            }
            curr = curr.GetNext();
        }
        if (curr.data < node.data) {
            node.SetNext(curr.GetNext());
            curr.SetNext(node);
            size++;
        }
    }





}