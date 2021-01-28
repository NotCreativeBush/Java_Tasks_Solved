package Task28_z23;

public class Node {
    private Task task;
    private Node next;

    public Node(Task task) {
        this.task = task;
    }

    public Node(Task task, Node next) {
        this(task);
        this.next = next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public Task getTask() {
        return task;
    }

}
