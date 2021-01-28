package Task27_z22.Problem2;

public class Node {
    private char val;
    private Node next;
    public Node(char val){
        this.val=val;
    }
    public Node(char val, Node next){
        this(val);
        this.next=next;
    }

    public Node getNext() {
        return next;
    }

    public char getVal() {
        return val;
    }
}
