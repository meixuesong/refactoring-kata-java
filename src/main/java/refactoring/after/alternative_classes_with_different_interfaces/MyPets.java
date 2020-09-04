package refactoring.after.alternative_classes_with_different_interfaces;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class MyPets {
    /**
     * TODO:
     * Cat和Dog是类似的类，需要统一接口
     * @param args
     */
    public static void main(String[] args) {
        Pet gulu = new Cat("Gulu");
        Pet boniu = new Cat("Boniu");

        Dog langtou = new Dog("Langtou");
        Dog bangchui = new Dog("Bangchui");

        gulu.addFriends(boniu.getName());
        langtou.addFriends(bangchui.getName());

        if (gulu.isFriendWith(bangchui.getName())) {
            System.out.println("I can't believe it");
        }
    }
}
