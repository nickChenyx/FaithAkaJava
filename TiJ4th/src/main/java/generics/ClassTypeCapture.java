package generics;

/**
 * Created by Administrator on 2017/2/5.
 */
class Building{}
class House extends Building{}
public class ClassTypeCapture<T> {
    Class<T> kind;
    public ClassTypeCapture(Class<T> kind){
        this.kind = kind;
    }
    public boolean f(Object obj) throws IllegalAccessException, InstantiationException {
        Building b = (Building) kind.newInstance();
        System.out.println(kind.getName()+", "+kind.getClassLoader());
        /*
        * 因为 T 在运行期是被擦除的
        * 所以无法使用 instanceof 关键字，取而代之的
        * 可以使用类型标签，转而使用动态的 isInstance()
        * */
        return kind.isInstance(obj);
    }

    public static void main(String[] args) throws Exception{
        ClassTypeCapture<Building> cttl = new ClassTypeCapture<Building>(Building.class);
        System.out.println(cttl.f(new Building()));
        System.out.println(cttl.f(new House()));
    }
}
