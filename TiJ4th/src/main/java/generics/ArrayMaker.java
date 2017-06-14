package generics;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Administrator on 2017/2/5.
 */
public class ArrayMaker<T> {
    private Class<T> kind;
    public ArrayMaker(Class<T> kind){
        this.kind = kind;
    }
    @SuppressWarnings("unchecked")
    T[] create(int size){
        System.out.println(kind.getName());
        return (T[]) Array.newInstance(kind, size);
    }

    public static void main(String[] args) {
        ArrayMaker<String> stringMaker = new ArrayMaker<String>(String.class);
        System.out.println(Arrays.toString(stringMaker.getClass().getTypeParameters()));
        String[] stringArray = stringMaker.create(4);
        System.out.println(Arrays.toString(stringArray));
    }
}
