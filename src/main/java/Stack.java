public class Stack {

    boolean isEmpty = true;

    public boolean isEmpty() {
        return isEmpty;
    }

    public int size() {
        return 0;
    }

    public void push(int i) {
        isEmpty = false;
    }
}
