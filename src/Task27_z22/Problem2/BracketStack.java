package Task27_z22.Problem2;

public class BracketStack {
    private Node top;
    public BracketStack(){

    }
    public BracketStack(Node top){
        this.top=top;
    }
    public void push(char t){
        top=new Node(t,top);
    }
    public char pop(){
        if(top!=null){
            char t=top.getVal();
            top=top.getNext();
            return t;
        }
        return '0';
    }
    public char expected(){
        char tmp=this.pop();
        if(tmp=='('){
            return ')';
        }
        if(tmp=='['){
            return ']';
        }
        return '}';
    }
}
