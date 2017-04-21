package chapter3.TwoThreadTransData;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nickChen
 * @create 2017-04-21 13:19.
 */
public class MyList {
    private volatile List list= new ArrayList();

    public void add() {
        list.add("cyx");
    }

    public int size(){
        return list.size();
    }
}
