package typeinfo;

import typeinfo.interfacea.A;

/**
 * Created by Administrator on 2017/2/3.
 */
public class AnonymousImplementation {
    public static void main(String[] args) throws Exception{
        A a = AnonymousA.makeA();
        a.f();
        System.out.println(a.getClass().getName());
        HiddenImplementation.CallHiddenMethod(a,"f");
        HiddenImplementation.CallHiddenMethod(a,"g");
        HiddenImplementation.CallHiddenMethod(a,"p");
    }
}
class AnonymousA{
    // 使用匿名内部类，看看反射是否能够进入
    public static A makeA(){
        return new A(){
            public void f(){
                System.out.println("public C.f()");
            }
            public void g(){
                System.out.println("public C.g()");
            }
            private void p(){
                System.out.println("private C.p()");
            }
        };
    }
}
