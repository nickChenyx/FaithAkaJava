package generics;

/**
 * Hourly 不能编译，因为擦除会将 Payable<Employee> 和 Payable<Hourly> 简化为相同的类 Payable，
 * 等同于重复两次地实现了相同的接口。
 * 不过如果从 Payable 的两种用法中都移除掉泛型参数，代码可以编译
 * Created by Administrator on 2017/2/9.
 */
interface Payable<T>{}
//class Employee implements Payable<Employee>{}
// generics.Payable' cannot be inherited with different type arguments: 'generics.Employee' and 'generics.Hourly
// class Hourly extends Employee implements Payable<Hourly>{}
class Employee implements Payable{}
class Hourly extends Employee implements Payable{}
public class MultipleInterfaceVariants {
}
