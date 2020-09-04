package refactoring.after.alternative_classes_with_different_interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class Dog implements Pet{
    private String name;
    private List<String> friends = new ArrayList<>();

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isFriendWith(String name) {
        return friends.contains(name);
    }

    @Override
    public void addFriends(String name) {
        if (!isFriendWith(name)) {
            friends.add(name);
        }
    }

    @Override
    public List<String> getFriends() {
        return Collections.unmodifiableList(friends);
    }
}
