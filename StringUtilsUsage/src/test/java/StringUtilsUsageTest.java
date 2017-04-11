import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.*;
/**
 * ref-link: https://commons.apache.org/proper/commons-lang/apidocs/org/apache/commons/lang3/StringUtils.html#mid-java.lang.String-int-int-
 * Created by nickChenyx on 2017/4/7.
 */

/**
 * StringUtils的详解
 * http://maplebb.blog.51cto.com/2547849/1843269
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 一定要提供的配置文件 ！
@ContextConfiguration(classes = BeanHub.class)
public class StringUtilsUsageTest {
    /**
     * 缩短字符串
     */
    @Test
    public void testAbbreviate(){
        String res = StringUtils.abbreviate("1234567890",8);
        assertEquals("1234567890 , 8 should be 12345...","12345...",res);
        res = StringUtils.abbreviate("12345678901234567890",5,15);
        assertEquals("12345678901234567890 ,2 ,8 shoule be 34567...","...678901234...",res);
        res = StringUtils.abbreviateMiddle("1234567890","*",8);
        assertEquals("1234567890 ,* ,8 should be 12345***","1234*890",res);
    }

    /**
     * isBlank() 判断字符串为"",null或者"   "空字符串
     * isEmpty() 判断字符串为 "",null
     */
    @Test
    public void testIsEmptyAndIsBlank(){
       String s1 = null;
       String s2 = "";
       String s3 = " ";
       assertTrue("s1 is not blank",StringUtils.isBlank(s1));
       assertTrue("s1 is not empty",StringUtils.isEmpty(s1));
       assertTrue("s2 is not blank",StringUtils.isBlank(s2));
       assertTrue("s2 is not empty",StringUtils.isEmpty(s2));
       assertTrue("s3 is not blank",StringUtils.isBlank(s3));
       // 有空格也不是empty
       assertFalse("s3 is empty",StringUtils.isEmpty(s3));
    }

    /**
     * trim 和 strip 去除字符串头尾空格
     */
    @Test
    public void testTrimAndStrip(){
        String s1 = "   123";
        String s2 = "abc   ";
        String s3 = "  123 abc  ";
        assertEquals("'   123'的trim()结果不为'123'","123",StringUtils.trim(s1));
        assertEquals("'   123'的strip()结果不为'123'","123",StringUtils.strip(s1));
        assertEquals("'abc   '的trim()结果不为'abc'","abc",StringUtils.trim(s2));
        assertEquals("'abc   '的strip()结果不为'abc'","abc",StringUtils.strip(s2));
        assertEquals("'  123 abc  '的trim()结果不为'123 abc'","123 abc",StringUtils.trim(s3));
        assertEquals("'  123 abc  '的strip()结果不为'123 abc'","123 abc",StringUtils.strip(s3));
    }

    /**
     * equals() 负责判断是否相等
     * compare() 返回的是int
     */
    @Test
    public void testEqualsAndCompare(){
       String s1 = null;
       String s2 = "";
       String s3 = "123";
       String s4 = "abc";
       String s5 = "123";
       assertFalse("s1 equals s2.",StringUtils.equals(s1,s2));
       assertTrue("s1 not equals s1",StringUtils.equals(s1,s1));
       assertFalse("s3 equal s4",StringUtils.equals(s3,s4));
       assertTrue("s3 not equal s5",StringUtils.equals(s3,s5));

        assertEquals("s1 equals s2.",-1,StringUtils.compare(s1,s2));
        assertEquals("s1 not equals s1",0,StringUtils.compare(s1,s1));
        assertEquals("s3 equal s4",-48,StringUtils.compare(s3,s4));
        assertEquals("s3 not equal s5",0,StringUtils.compare(s3,s5));

    }

    /**
     * startWith / endWith
     */
    @Test
    public void testStartWithAndEndWith(){
        String s = "We are family.";
        assertFalse("'We are family.' start with 'we'",StringUtils.startsWith("We are family.","we"));
        assertFalse("'We are family.' end with ly",StringUtils.endsWith("We are family.","ly"));
        assertTrue("'We are family.' start with 'We'",StringUtils.startsWith("We are family.","We"));
        assertTrue("'We are family.' end with 'y.'",StringUtils.endsWith("We are family.","y."));
    }

    /**
     * indexOf / lastIndexOf / contains
     * null safe
     */
    @Test
    public void testIndexOfAndLastIndexOfAndContains(){
        String url = "https://commons.apache.org/proper/commons-lang/apidocs/org/apache/commons/lang3/StringUtils.html#isBlank-java.lang.CharSequence-";
        assertEquals(": should be founded at index 5 of url",5,StringUtils.indexOf(url,":"));
        assertEquals(". should be last founded before the 'CharSequence-'",114,StringUtils.lastIndexOf(url,"."));
        assertTrue("url should have substring-'html'",StringUtils.contains(url,"html"));
        System.out.println(StringUtils.indexOfAny(url,"abc"));
    }

    /**
     * indexOfAny 会把需要查找的 string 给打散成 char 数组分开查找
     * lastIndexOfAny 查找数组中的 string
     */
    @Test
    public void testIndexOfAnyAndLastIndexOfAny(){
        String url = "https://commons.apache.org/proper/commons-lang/apidocs/org/apache/commons/lang3/StringUtils.html#isBlank-java.lang.CharSequence-";
        String[] search = {"lang","com"};
        assertEquals("'abc' will be 'a','b','c',and find the first index of them. ",8,StringUtils.indexOfAny(url,"abc"));
        assertEquals("first index of Array-search",8,StringUtils.indexOfAny(url,search));
        assertEquals("not found 'abc'",-1,StringUtils.lastIndexOfAny(url,"abc"));
        assertEquals("last index of Array-search",110,StringUtils.lastIndexOfAny(url,search));
    }

    /**
     * subString / left / right
     * mid : pos-where go start, len-len of str
     */
    @Test
    public void testSubStringAndLeftAndRightAndMid(){
        String url = "https://commons.apache.org/proper/commons-lang/";
        assertEquals("commons.apache.org/proper/commons-lang/",StringUtils.substring(url,8));
        assertEquals("https://",StringUtils.left(url,8));
        assertEquals("ns-lang/",StringUtils.right(url,8));
        assertEquals("commons.",StringUtils.mid(url,8,8));
    }
}
