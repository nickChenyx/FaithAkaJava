package generics;

/**
 *  无界通配符 <?>
 *      编译器何时关注原生类型和涉及无界通配符的类型之间的差异
 * Created by Administrator on 2017/2/9.
 */
public class Wildcards {
    static void rawArgs(Holder holder, Object obj){
        holder.set(obj);    // Warning !
                            //Unchecked call to 'set(T)' as a member of raw type 'generics.Holder'

        Object o = holder.get();
    }
    static void unboundedArg(Holder<?> holder, Object obj){
        //holder.set(obj);    // Error !
                            //set
                            //(capture<?>)
                            //        in Holder cannot be applied
                            //        to
                            // (java.lang.Object) 

        Object o = holder.get();
    }
}
