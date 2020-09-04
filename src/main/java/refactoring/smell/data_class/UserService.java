package refactoring.smell.data_class;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */ //TODO: 1. 将行为移到User, 去除UserService; 2. 用户的年龄应该是只读的
public class UserService {

    public void changeAddress(User user, String fullAddress) {
        String[] list = fullAddress.split(" ");
        user.setProvince(list[0]);
        user.setCity(list[1]);
        user.setStreet(list[2]);
        user.setAddress(list[3]);
        user.setTelephone(list[4]);
        user.setMobilePhone(list[5]);
    }

    public int getAge(User user) {
        Date now = new Date();
        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        int d1 = Integer.parseInt(formatter.format(user.getBirthday()));
        int d2 = Integer.parseInt(formatter.format(now));
        int age = (d2 - d1) / 10000;
        return age;
    }
}
