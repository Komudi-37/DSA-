class MyStack {
    java.util.Queue<Integer> q;

    public MyStack() {
        q = new java.util.LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
        
        // rotate elements
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}