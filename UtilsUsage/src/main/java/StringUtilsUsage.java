import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Bean;

/**
 * Created by nickChenyx on 2017/4/7.
 */

public class StringUtilsUsage {

    public String abbreviate(String str,int length){
        return StringUtils.abbreviate(str,length);
    }
}
