package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 动态类型安全：在传递泛型容器的时候，可能会因为遗留代码中的参数是非泛型参数，破坏了容器。
 * Java SE5 中的 java.util.collections 中有一组便利工具，可以解决这种情况下的类型检测问题。
 * 他们是静态方法：checkedCollection()、checkedList()、checkedMap()、checkedSet()、checkedSortedMap()
 * checkedSortedSet()，这些方法，接受你希望动态检查的容器作为第一个参数接受，并将你希望强制要求的类型作为第二个参数接受
 * Created by Administrator on 2017/2/14.
 */
public class CheckedList {
    @SuppressWarnings("unchecked")
    static void oldStyleMethod(List probablyDogs){// 旧式代码中未用到泛型参数
        probablyDogs.add(new Cat());
    }

    public static void main(String[] args) {
        List<Dog> dogs1 = new ArrayList<Dog>();
        oldStyleMethod(dogs1); // dogs1 接受了一个 Cat 参数，并且未报错。
        List<Dog> dogs2 = Collections.checkedList(new ArrayList<Dog>(),Dog.class);
        try{
            oldStyleMethod(dogs2);
        }catch (ClassCastException e){
            e.printStackTrace();
        }
        // 继承类型也可以适用于动态检查
        List<Pet> pets = Collections.checkedList(new ArrayList<Pet>(),Pet.class);
        pets.add(new Dog());
        pets.add(new Cat());
    }

}

class Pet{}
class Dog extends Pet{}
class Cat extends Pet{}
