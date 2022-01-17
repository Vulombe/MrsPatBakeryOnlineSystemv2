
package za.co.bakery.service;

import za.co.bakery.dbao.UserRegistrationDAO;
import za.co.bakery.dbao.UserRegistrationDAOImpl;

public class UserRegistrationServiceImpl implements UserRegistrationService{

      private UserRegistrationDAO userRegDao;
    public UserRegistrationServiceImpl(){
        this.userRegDao=new UserRegistrationDAOImpl();
    }
    @Override
    public void registerUser(String title, String lastName, String firstName, String email, String password) {
        userRegDao.registerUser(title, lastName, firstName, email, password);
    }
    
}
