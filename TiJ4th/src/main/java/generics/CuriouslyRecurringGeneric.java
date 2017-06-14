package generics;

/**
 * 自限定类型
 *
 * Created by Administrator on 2017/2/11.
 */
class GenericType<T>{}
// 理解为：“我在创建一个类，这个类继承自一个泛型类型，该泛型类型接受我的类名作为其泛型参数”
public class CuriouslyRecurringGeneric extends GenericType<CuriouslyRecurringGeneric>{}
