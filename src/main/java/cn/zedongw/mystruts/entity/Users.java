package cn.zedongw.mystruts.entity;
import	java.util.Date;

/**
 * @ClassName Users
 * @Description: 用户实体类
 * @Author ZeDongW
 * @Date 2019/11/30/0030 13:55
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class Users {

    private String userName; //用户名

    private int age; //年龄

    private Date birthday; //生日

    private Address address; //地址

    public Users() {
    }

    public Users(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public Users(String userName, int age, Date birthday, Address address) {
        this.userName = userName;
        this.age = age;
        this.birthday = birthday;
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", address=" + address +
                '}';
    }
}
