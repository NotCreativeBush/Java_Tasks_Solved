package Task27_z22;


public class RPNStack {
    private Node top;
    public RPNStack(Node top){
        this.top=top;
    }
    public RPNStack(){

    }
    public void push(double d) {
        if (top != null){
            top.setNext(top);
            top.setVal(d);
        }
        else{
            top=new Node(d);
        }
    }

    public double pop() {
        double a = top.getVal();
        top = top.getNext();
        return a;

    }
    public boolean empty(){
        return top==null;
    }
}
