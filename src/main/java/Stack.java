public class Stack {

    boolean isEmpty = true;
    int size;
    int element;

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void push(int element) {
        this.element = element;
        isEmpty = false;
        size++;
    }

    public int pop() {
        isEmpty = true;
        size--;
        return element;
    }
}
