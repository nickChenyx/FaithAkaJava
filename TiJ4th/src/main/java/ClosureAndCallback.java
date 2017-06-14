/**
 * Created by Administrator on 2017/1/24.
 */

interface Incrementable{
    void increment();
}

class Callee1 implements Incrementable{
    public void increment() {
        System.out.println("Callee1.increment()  executed...");
    }
}


/**
 * Use class *Closure* execute *Callee2* method,
 * and inner class impl interface *Incremntable*,
 * then Callee2's Callback as *Caller* 's constructor parameter make sense
 * */
class Callee2{
    private void increment(){
        System.out.println("Callee2.MyIncrement.increment()  executed...");
    }

    class Closure implements Incrementable{
        public void increment(){
            Callee2.this.increment();
        }
    }

    public Incrementable getCallbackRef(){
        return new Closure();
    }

}

class Caller{
    private Incrementable ref;
    public Caller(Incrementable callback){
        ref = callback;
    }
    void go(){
        ref.increment();
    }
}
public class ClosureAndCallback {


    Callee1 c1 = new Callee1();
    Callee2 c2 = new Callee2();

    Caller cr1 = new Caller(c1);
    Caller cr2 = new Caller(c2.getCallbackRef());
    public static void main(String[] args) {
        ClosureAndCallback main = new ClosureAndCallback();
        main.cr1.go();
        main.cr2.go();
    }
}
