import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2017/1/30.
 */
public class RegularExpression_10 {
    public static void main(String[] args) {
        if(args.length<2){
            System.out.println("Usage:\n" +
                    "TestRegularExpressionString " +
                    "characterSequenceRegularExpression");
            System.exit(0);
        }
        System.out.println("Input: " +
                args[0]);
        for (String pattern: args){
            System.out.println("RegularExpression: "+pattern);
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(args[0]);
            while (m.find()){
                System.out.println("Match: " + m.group() + " at position"
                        + m.start() + "-" + (m.end()-1));
            }
        }
    }
}
