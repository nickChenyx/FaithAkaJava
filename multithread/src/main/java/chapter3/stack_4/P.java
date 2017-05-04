package chapter3.stack_4;

/**
 * @author nickChen
 * @create 2017-04-21 15:38.
 */
public class P {
    private MyStack myStack;

    public P(MyStack myStack) {
        this.myStack = myStack;
    }

    public void pushService() {
        myStack.push();
    }
}
