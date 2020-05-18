package Service;

import Model.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    UserService userService;
    @Test
    void addUser() {
    }

    @Test
    void removeUser() {
    }

    @Test
    void getUser() {
        User name1 = userService.getUser(1);
        User name2 = userService.getUser(2);
        User name3 = userService.getUser(3);
        User name4 = userService.getUser(4);

        System.out.println(name1 + " " + name2 + " " + name3 + " " + name4);
    }
}
