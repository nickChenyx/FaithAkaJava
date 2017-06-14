package generics;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/2/8.
 */
public class GenericReading {
    static <T> T readExact(List<T> list){
        return list.get(0);
    }
    static List<Bean1> bean1s = Arrays.asList(new Bean1());
    static List<Bean> beans = Arrays.asList(new Bean());
    static void f1(){
        Bean1 b1 = readExact(bean1s);
        Bean b = readExact(beans);
        b = readExact(bean1s);
    }
    static class Reader<T>{
        T readExact(List<T> list){ return list.get(0); }
    }
    static void f2(){
        Reader<Bean> beanReader = new Reader<Bean>();
        Bean b = beanReader.readExact(beans);

        // Bean bb = beanReader.readExact(bean1s); // bean 而非 bean1
    }
    static class CovariantReader<T>{
        T readCovariant(List<? extends T> list){
            return list.get(0);
        }
    }
    static void f3(){
        CovariantReader<Bean> beanCovariantReader = new CovariantReader<Bean>();
        Bean b = beanCovariantReader.readCovariant(beans);
        Bean bb = beanCovariantReader.readCovariant(bean1s);
    }
}
