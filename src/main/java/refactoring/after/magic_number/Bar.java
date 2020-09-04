package refactoring.after.magic_number;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class Bar {

    private static final int LEAGAL_DRINK_AGE = 18;

	/**
     * 判断年龄是否达到18岁可饮酒年龄，以及状态是否有效
     * @param age
     * @param status：状态分为有效和无效
     * @return
     */
    public boolean doSomething(int age, StatusEnum status) {
        if (age > LEAGAL_DRINK_AGE && status == StatusEnum.ACTIVE) {
            return true;
        } else {
            return false;
        }
    }
}
