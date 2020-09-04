package refactoring.after.alternative_classes_with_different_interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class Cat implements Pet {
    private String name;
    private List<String> friends = new ArrayList<>();

    public Cat(String name) {
        this.name = name;
    }

    @Override
	public String getName() {
        return name;
    }

    @Override
	public boolean isFriendWith(String catName) {
        return friends.contains(catName);
    }

    @Override
	public void addFriends(String catName) {
        friends.add(catName);
    }

    @Override
	public List<String> getFriends() {
        return Collections.unmodifiableList(friends);
    }
}
