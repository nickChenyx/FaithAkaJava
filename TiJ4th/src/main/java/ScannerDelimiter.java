/**
 * Created by Administrator on 2017/1/31.
 */
/**
 * Created by Administrator on 2017/1/31.
 */
import java.util.Scanner;
import java.util.regex.MatchResult;

public class ScannerDelimiter {

    static String threatData = "58.27.82.161@02/10/2005\n"
            + "204.45.234.40@02/11/2005\n" + "58.27.82.161@02/11/2005\n"
            + "58.27.82.161@02/12/2005\n" + "58.27.82.161@02/13/2005\n"
            + "[next log section with different data format]";
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner("12, 42,78,99,42");// 默认情况下,Scanner根据空白字符对输入进行分词,但是你可以用正则表达式指定自己所需的定界符
        scanner.useDelimiter("\\s*,\\s*");// 使用逗号(包括逗号前后任意的空白字符)作为定界符
        System.out.println(scanner.delimiter());// 使用delimiter()方法用来返回当前正在作为定界符的Pattern对象
        while (scanner.hasNextInt())
            System.out.print(scanner.nextInt() + "\t");
        System.out.println();
        // 使用正则表达式扫描
        // 当next()方法配合指定的正则表达式使用时,将找到下一个匹配该模式的输入部分,调用match()方法就可以获得匹配结果.
        // 注意:在配合正则表达式使用扫描时,它仅仅针对下一个输入分词进行匹配,如果正则表达式中含有界定符,那永远都不可能匹配成功.
        scanner = new Scanner(threatData);
//        scanner.useDelimiter("！");//使用正则匹配文本时，不能使用定界符！否则匹配不可能成功
        String pattern = "(\\d+[.]\\d+[.]\\d+[.]\\d+)@"
                + "(\\d{2}/\\d{2}/\\d{4})";
        while (scanner.hasNext(pattern)) {
            scanner.next(pattern);
            MatchResult match = scanner.match();
            String ip = match.group(1);
            String date = match.group(2);
            System.out.format("Threat on %s from %s\n", date, ip);
        }
    }
}
