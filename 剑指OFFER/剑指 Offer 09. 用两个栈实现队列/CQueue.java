import java.util.Stack;

class CQueue {

    Stack<Integer> push = new Stack<>();

    Stack<Integer> pop = new Stack<>();

    public CQueue() {

    }

    public void appendTail(int value) {
        push.push(value);
    }

    public int deleteHead() {
        if (!pop.isEmpty()) {
            return pop.pop();
        }
        while(!push.isEmpty()) {
            pop.push(push.pop());
        }
        if (pop.isEmpty()) {
            return -1;
        }
        return pop.pop();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */