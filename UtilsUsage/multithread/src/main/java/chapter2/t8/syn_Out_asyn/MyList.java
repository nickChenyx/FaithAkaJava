package chapter2.t8.syn_Out_asyn;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nickChen
 * @create 2017-04-20 15:35.
 */
public class MyList {
    private List list = new ArrayList();
    synchronized public void add(String username){
        System.out.println("ThreadName="+Thread.currentThread().getName()+" execute add()");
        list.add(username);
        System.out.println("ThreadName="+Thread.currentThread().getName()+" exit add()");
    }
    synchronized public int getSize(){
        System.out.println("ThreadName="+Thread.currentThread().getName()+" execute getSize()");
        int size = list.size();
        System.out.println("ThreadName="+Thread.currentThread().getName()+" exit getSize()");
        return size;
    }
}
