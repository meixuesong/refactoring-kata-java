package refactoring.smell.excessive_indentation;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserTest {
    @Test
    public void should_has_name_with_length_between_6_and_25() {
        String aa = "aa";
        String a8 = "aaaaaaaa";

        User user = new User();

        assertFalse(user.validateUserName(aa));
        assertTrue(user.validateUserName(a8));
    }

    @Test
    public void should_has_name_with_only_alpha_and_number() {
        String aa = "aaaaaaaa!";
        String a8 = "a12aaaaaa";

        User user = new User();

        assertFalse(user.validateUserName(aa));
        assertTrue(user.validateUserName(a8));
    }

    @Test
    public void should_has_no_curse_word() {
        String curseName = "aaaaafuckaaa";

        User user = new User();

        assertFalse(user.validateUserName(curseName));
    }

    @Test
    public void should_has_unique_name() {
        String existName = "JackLi";
        String newName = "JackLei";

        User user = new User();

        assertFalse(user.validateUserName(existName));
        assertTrue(user.validateUserName(newName));
    }
}