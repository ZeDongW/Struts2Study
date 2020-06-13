package cn.zedongw.mystruts.entity;

/**
 * @ClassName Address
 * @Description: 地址实体类
 * @Author ZeDongW
 * @Date 2019/12/4/0004 23:10
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class Address {

    private String province; //省份

    private String city; //城市

    public Address() {
    }

    public Address(String province, String city) {
        this.province = province;
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
