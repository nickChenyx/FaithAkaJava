package typeinfo;
import typeinfo.interfacea.A;

/**
 * Created by Administrator on 2017/2/3.
 */
public class B implements A {
    public void f(){
        System.out.println("B.f()");
    }
    public void g(){
        System.out.println("B.g()");
    }

    public static void main(String[] args) {
        A a = new B();
        a.f();
        // 可以看到这里的 a 实际上被当做 B 的实现！
        System.out.println(a.getClass().getName());
        if (a instanceof B){
            B b = (B)a;
            b.g();
        }
    }
}


