package refactoring.after.large_class;

import java.util.Date;

/**
 * TODO：
 * Person类过大，请将它重构成三个类，Person及其两个子类：Manager, SalesPerson
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class Person {
    //员工ID
    private String id;
    //姓名
    private String name;
    //生日
    private Date birthday;
    //地址
    private PersonAddress address = new PersonAddress();

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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

	public PersonAddress getAddress() {
		return address;
	}

	public void setAddress(PersonAddress address) {
		this.address = address;
	}

}
