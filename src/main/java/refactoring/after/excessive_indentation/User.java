package refactoring.after.excessive_indentation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 * TODO: 修复过深的嵌套
 */
public class User {
    public boolean validateUserName(String userName) {
        boolean isValid = false;
        int minUserNameLength = 6;
        if (userName.length() < minUserNameLength) {
            return isValid;
        }
        int maxUserNameLength = 25;
        if (userName.length() > maxUserNameLength) {
            return isValid;
        }
        boolean isAlphaNumeric = isAlphaAndNumeric(userName);
        if (!isAlphaNumeric) {
            return isValid;
        }
        if (!containsCurseWords(userName)) {
            isValid = isUniqueUserName(userName);
        }

        return isValid;
    }

    private boolean isUniqueUserName(String userName) {
        Set<String> existsNames = new HashSet<>();
        existsNames.addAll(Arrays.asList("JackLi", "JackWang", "JackZhang"));

        return ! existsNames.contains(userName);
    }

    private boolean containsCurseWords(String userName) {
        return userName.contains("fuck");
    }

    private boolean isAlphaAndNumeric(String userName) {
        for (char c : userName.toCharArray()) {
            if (! ((c >= 'a' && c <= 'z') ||
                    (c >= 'A' && c <= 'Z') ||
                    (c >= '0' && c <= '9'))) {
                return false;
            }
        }

        return true;
    }
}
