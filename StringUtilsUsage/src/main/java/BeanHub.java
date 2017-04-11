import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by nickChenyx on 2017/4/7.
 */

/**
 * 设置为一个配置类，可供测试时提供配置
 */
@Configuration
public class BeanHub {
    @Bean
    public StringUtilsUsage getStringUtilsUsage(){
        return new StringUtilsUsage();
    }

}
