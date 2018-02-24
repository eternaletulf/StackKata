public class Stack {

    private int size;
    private int element;

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void push(int element) {
        this.element = element;
        size++;
    }

    public int pop() {
        size--;
        return element;
    }
}
