package Task28_z23;

public class QueueOfTasks {
    private Node head;
    private Node tail;

    public QueueOfTasks() {

    }

    public QueueOfTasks(Node head) {
        this.head = head;
    }

    public void enqueue(Task t) {
        if (empty()) {
            head = new Node(t);
            tail = head;
        } else {
            tail.setNext(new Node(t));
            tail = tail.getNext();
        }
    }

    public Task dequeue() {
        if(empty()){
            throw new RuntimeException("Queue is empty");
        }
        Task ans = head.getTask();
        head = head.getNext();
        return ans;
    }

    public boolean empty() {
        return head == null;
    }
}
