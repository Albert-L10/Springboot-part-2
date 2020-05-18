package Service;

import Model.User;

public interface UserService {
    void addUser(long id,String name,String surname);

    void removeUser(long Id);

    User getUser(long Id);
    public void cacheUser(String cache);
}
