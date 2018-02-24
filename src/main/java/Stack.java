import java.util.LinkedList;
import java.util.List;

public class Stack {

    private List<Integer> element;

    public Stack() {
        element = new LinkedList<>();
    }

    public boolean isEmpty() {
        return element.isEmpty();
    }

    public int size() {
        return element.size();
    }

    public void push(int pushed) {
        element.add(pushed);
    }

    public int pop() {
        return element.remove(element.size() - 1);
    }
}
