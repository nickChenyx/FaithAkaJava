package chapter2.t9;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nickChen
 * @create 2017-04-20 15:46.
 */
public class MyOneList {
    private List list = new ArrayList();
    synchronized public void add(String data){
        list.add(data);
    }
    synchronized public int getSize(){
        return list.size();
    }

}
