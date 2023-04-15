package mylib.datastructures.linear;
import mylib.datastructures.nodes.DNode;
public class LLStack extends SLL{



    /////////////////////////////////////

    //   NEED TO RECHK IF EVERYTHING IS OK
    //   NEED TO CHECK IF ALL THE FUNCTIONS ARE THERE OR NOT

    /////////////////////////////////////

    public LLStack() {
        super();
    }

    public LLStack(DNode head) {
        super(head);
    }

    public void Push(DNode node) {
        super.InsertHead(node);
    }

    public DNode Pop() {
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

    @Override
    public void Delete(DNode node) {}

    @Override
    public void Sort() {}
    
}
