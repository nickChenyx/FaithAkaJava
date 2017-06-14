package typeinfo;

import typeinfo.interfacea.A;
import typeinfo.packageaccess.HiddenC;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/2/3.
 */
public class HiddenImplementation {
    public static void main(String[] args) throws Exception {
        A a = HiddenC.makeA();
        a.f();
        System.out.println(a.getClass().getName());
        /*
        // 这里 C 只具有包访问权限，会报 Compile error: cannot find symbol 'C'
        if (a instanceof C){

        }
        */
        // 但是可以使用反射来调用所有方法，包括 private
        CallHiddenMethod(a,"g");
        CallHiddenMethod(a,"f");
        CallHiddenMethod(a,"p");
    }
    public static void CallHiddenMethod(Object o, String methodName) throws Exception{
        Method method = o.getClass().getDeclaredMethod(methodName);
        method.setAccessible(true);
        method.invoke(o);
    }
}
