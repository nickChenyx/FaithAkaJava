/**
 * Created by Administrator on 2017/1/24.
 */
/**
 * class could be defined in interface.(static class)
 * */
public interface ClassInInterface {
    void foo(int i);
    /**
    * class in interface will automatic modified *public* & *static*
    * */
    class Test{
        public static void main(String[] args) {
            System.out.println("Static class in Interface");
            TestImpl impl = new TestImpl();
            impl.foo(1);
        }
    }
    /**
     * class in interface yet impl outer interface!
     * */
    class TestImpl implements ClassInInterface{
        public void foo(int i) {
            System.out.println("ClassInInterface.foo() executed...  "+i);
        }
    }
}
