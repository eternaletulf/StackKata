public class Stack {

    boolean isEmpty = true;
    int size;

    public boolean isEmpty() {
        return isEmpty;
    }

    public int size() {
        return size;
    }

    public void push(int i) {
        isEmpty = false;
        size++;
    }

    public void pop() {
        isEmpty = true;
        size--;
    }
}
