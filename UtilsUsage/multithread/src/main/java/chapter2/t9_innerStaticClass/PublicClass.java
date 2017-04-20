package chapter2.t9_innerStaticClass;

/**
 * @author nickChen
 * @create 2017-04-20 17:45.
 */
public class PublicClass {
    static private String username;
    static private String password;
    static class PrivateClass{
        private String age;
        private String address;
        public void printPublicProperty(){
            System.out.println(username+" "+password);
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

    public  String getUsername() {
        return username;
    }

    public  void setUsername(String username) {
        PublicClass.username = username;
    }

    public  String getPassword() {
        return password;
    }

    public  void setPassword(String password) {
        PublicClass.password = password;
    }
}
