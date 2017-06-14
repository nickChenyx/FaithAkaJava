/**
 * Created by Administrator on 2017/1/24.
 */

class Outer{
    private int num ;
    Outer(int i){num=i;}
    class Inner{}
}
public class InheritInner extends Outer.Inner {
    /**
     * the class inherit innerclass, it's constructor
     * must use the syntax like below:
     *      enclosingClassRef.super()
     * */
    InheritInner(Outer o){
        o.super();
    }

    class InnerClassExtendsInner extends Outer.Inner{
        InnerClassExtendsInner(Outer o){
            o.super();
        }
    }

    public static void main(String[] args) {
        InheritInner ii = new InheritInner(new Outer(1));
    }
}


