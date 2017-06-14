package annotations;

/**
 * Created by Administrator on 2017/2/15.
 */
public class Testable {
    public void execute(){
        System.out.println("Executing...");
    }
    @Test void testExecute(){ execute(); }
}
