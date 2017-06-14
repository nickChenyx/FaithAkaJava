package typeinfo.packageaccess;

import typeinfo.interfacea.A;

/**
 * Created by Administrator on 2017/2/3.
 */
public class HiddenC {
    public static A makeA(){
        return new C();
    }
}

class C implements A {
    public void f(){
        System.out.println("public C.f()");
    }
    public void g(){
        System.out.println("public C.g()");
    }
    private void p(){
        System.out.println("private C.p()");
    }
}