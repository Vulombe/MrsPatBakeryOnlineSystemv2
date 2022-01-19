<<<<<<< HEAD
package za.co.bakery.dbao;

import java.util.List;
import za.co.bakery.domain.User;
=======

package za.co.bakery.dbao;
>>>>>>> ebdf52d7c2de03e58c654e3f009d94bc74e1ae0b

/**
 *
 * @author student12
 */
public interface UserDOA {
<<<<<<< HEAD

    public int create(User u);

    public User read(User u);

    public User read();

    public boolean isNewUser(User u);

    boolean isUserValid(String email, String password);

=======
    boolean isUserValid(String email,String password);
    //lots of user related methods
>>>>>>> ebdf52d7c2de03e58c654e3f009d94bc74e1ae0b
}
