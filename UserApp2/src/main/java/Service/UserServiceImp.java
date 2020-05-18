package Service;

import Model.User;
import Repository.FakeRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class UserServiceImp  implements UserService {

    private User user;
    @Autowired
    private FakeRepoInterface fakeRepoInterface;
    @Override
    public void addUser(long id,String name, String surname) {

        fakeRepoInterface.insertUser(id,name,surname);
        System.out.println(user.getName() + " entered");


    }

    @Override
    public void removeUser(long Id) {

        fakeRepoInterface.deleteUser(Id);
        System.out.println(user.getName() + " removed");

    }

    @Override
    public User getUser(long Id) {
        return fakeRepoInterface.findUserById(Id);

    }

    public void cacheUser(String cache){
        try
        {
            System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
            Thread.sleep(1000*5);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
