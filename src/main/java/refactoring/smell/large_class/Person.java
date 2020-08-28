package refactoring.smell.large_class;

import java.util.Date;

/**
 * TODO：
 * Person类过大，请将它重构成三个类，Person及其两个子类：Manager, SalesPerson
 */
public class Person {
    //员工ID
    private String id;
    //姓名
    private String name;
    //是否管理员
    private boolean managerRole;
    //生日
    private Date birthday;
    //联系地址
    private String province;
    private String city;
    private String street;
    private String address;
    private String telephone;
    private String mobilePhone;

    /**
     * 订单审批同意，只有管理员才可以进行此操作
     *
     * @param order
     */
    public void approve(Order order) {
        if (!managerRole) {
            throw new RuntimeException("Only manager can approve order.");
        }

        //...
    }

    /**
     * 订单审批拒绝，只有管理员才可以进行此操作
     *
     * @param order
     */
    public void decline(Order order) {
        if (!managerRole) {
            throw new RuntimeException("Only manager can approve order.");
        }

        //...
    }

    /**
     * 发起订单审批申请
     *
     * @param manager 审批人
     * @param order   订单
     */
    public void apply(Person manager, Order order) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isManagerRole() {
        return managerRole;
    }

    public void setManagerRole(boolean managerRole) {
        this.managerRole = managerRole;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
}
