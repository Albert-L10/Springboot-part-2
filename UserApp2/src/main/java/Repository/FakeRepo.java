package Repository;

import Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public abstract class FakeRepo implements FakeRepoInterface {

    @Autowired
    private FakeRepoInterface fakeRepoInterface;

    private User user;

    private static Map<Integer, User> userData;

    static {
        userData=new HashMap<Integer, User>(){
            {
                put(1,new User(1,"Thomas","Moodley"));
                put(2,new User(2,"Nancy","Freeman"));
                put(3,new User(3,"Moses","Zulu"));
                put(4,new User(4,"Kharima","Naidoo"));
            }

        };
    }


    @Override
    public Collection<User> getAllUsers() {
        return this.userData.values();
    }

    @Override
    public void insertUser(long id, String name, String surname) {


        User user= (User) userData.entrySet();
        user.setId(id);
        user.setName(name);
        user.setSurname(surname);




    }

    @Override
    public User findUserById(long id) {
        this.userData.get(id);
        return null;
    }

    @Override
    public void deleteUser(long id) {

        this.userData.remove(id);

    }
}

