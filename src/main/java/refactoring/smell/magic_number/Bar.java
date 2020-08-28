package refactoring.smell.magic_number;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class Bar {

    /**
     * 判断年龄是否达到18岁可饮酒年龄，以及状态是否有效
     * @param age
     * @param status：状态分为有效（1）和无效（0）
     * @return
     */
    public boolean doSomething(int age, int status) {
        //TODO
        if (age > 18 && status == 1) {
            return true;
        } else {
            return false;
        }
    }
}
