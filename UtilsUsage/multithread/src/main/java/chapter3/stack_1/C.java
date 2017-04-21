package chapter3.stack_1;

/**
 * @author nickChen
 * @create 2017-04-21 15:39.
 */
public class C {
    private MyStack myStack;

    public C(MyStack myStack) {
        this.myStack = myStack;
    }

    public void popService() {
        System.out.println("pop="+myStack.pop());
    }
}
