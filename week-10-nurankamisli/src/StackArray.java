import java.util.ArrayList;
public class StackArray implements Stack {
    private ArrayList<Object> stack=new ArrayList<>();

    public void push(Object item) {
        stack.add(0,item);
    }

    public Object pop() {
        return stack.remove(0);
    }

    public void peek() {
        System.out.println("The top is "+stack.get(0));
    }
    public boolean isEmpty() {
        return stack.size()==0;
    }
}
