package Task27_z22.Problem1;

public class Node {
    private double val;
    private Node next;
    public Node(double val){
        this.val=val;
    }
    public Node(double val, Node next){
        this(val);
        this.next=next;
    }
    public void setVal(double val){
        this.val=val;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public double getVal() {
        return val;
    }

    public Node getNext() {
        return next;
    }
}
