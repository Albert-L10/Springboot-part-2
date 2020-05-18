package Repository;

import Model.User;

import java.util.Collection;

public interface FakeRepoInterface {

    Collection<User> getAllUsers();

    void insertUser(long id,String name,String surname);

    User findUserById(long id);

    void deleteUser(long id);


}
