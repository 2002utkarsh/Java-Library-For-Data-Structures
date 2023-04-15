package mylib.datastructures.linear;
import mylib.datastructures.nodes.DNode;
public class LLQueue extends SLL{

    public LLQueue() {
        super();
    }

    public LLQueue(DNode head) {
        super(head);
    }

    public void Enqueue(DNode node) {
        super.InsertTail(node);
    }

    public DNode Dequeue() {
        DNode temp = this.head;
        super.DeleteHead();
        return temp;
    }

    public DNode Peek() {
        return this.head;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void Print() {
        super.Print();
    }

    @Override
    public String toString() {
        String str = "The Queue is: ";
        DNode curr = this.head;
        while (curr != null) {
            str += curr.data + " ";
            curr = curr.next;
        }
        return str;
    }

    @Override
    public void InsertHead(DNode node) {}
    @Override
    public void InsertTail(DNode node){}
    @Override
    public void Insert(DNode node, int position){}
    @Override
    public void SortedInsert(DNode node) {}
    @Override
    public void DeleteHead() {}
    @Override
    public void DeleteTail() {}
    
    
}
