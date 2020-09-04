package refactoring.after.alternative_classes_with_different_interfaces;

import java.util.List;

public interface Pet {

	String getName();

	boolean isFriendWith(String name);

	void addFriends(String name);

	List<String> getFriends();

}
