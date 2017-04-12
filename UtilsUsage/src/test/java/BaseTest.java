import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by nickChenyx on 2017/4/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 一定要提供的配置文件 ！
@ContextConfiguration(classes = BeanHub.class)
public class BaseTest {
}
