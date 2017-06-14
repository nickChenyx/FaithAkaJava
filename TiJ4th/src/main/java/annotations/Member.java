package annotations;

/**
 * Created by Administrator on 2017/2/15.
 */
@DBTable(name = "MEMBER")
public class Member {
    // 因为定义的是名为 value 的元素，如果这是唯一需要赋值的元素，则可以直接使用如下形式
    @SQLString(30) String firstName;
    @SQLString(50) String lastName;
    @SQLInteger Integer age;
    @SQLString(value = 30,constraints = @Constraints(primaryKey = true))
    String handle;
    static int memberCount;

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Integer getAge() {
        return age;
    }

    public String getHandle() {
        return handle;
    }

    @Override
    public String toString(){
        return handle;
    }
}
