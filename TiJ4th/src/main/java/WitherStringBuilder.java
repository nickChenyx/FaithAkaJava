/**
 * Created by Administrator on 2017/1/29.
 */
public class WitherStringBuilder {
    String implicit(String[] fields){
        String res = "";
        for (int i = 0; i < fields.length; i++) {
            res+=fields[i];
        }
        return res;
    }
    String explicit(String[] fields){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < fields.length; i++) {
            sb.append(fields[i]);
        }
        return sb.toString();
    }
}
