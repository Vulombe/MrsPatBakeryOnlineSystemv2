package za.co.bakery.service;

<<<<<<< HEAD
import java.util.List;
import za.co.bakery.domain.User;


public interface UserService {
 
    void create(String title,String lastName,String firstName,String email, String password);
    boolean isUserValid(String email,String password);
    public User read(User u);
    List<User> getUsers();
}


=======

public interface UserService {
    boolean isUserValid(String email,String password);
}
>>>>>>> ebdf52d7c2de03e58c654e3f009d94bc74e1ae0b
