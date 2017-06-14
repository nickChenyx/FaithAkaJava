package generics;

/**
 * Created by Administrator on 2017/2/11.
 */
public class BasicHolder<T> {
    T element;
    void set(T arg){ element = arg; }
    T get(){ return element; }
    void f(){
        System.out.println(element.getClass().getSimpleName());
    }
}
