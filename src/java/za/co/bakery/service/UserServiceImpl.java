
package za.co.bakery.service;

import za.co.bakery.dbao.UserDOA;
import za.co.bakery.dbao.UserDOAImpl;


public class UserServiceImpl implements UserService{
    private UserDOA userdao;
    public UserServiceImpl(){
        this.userdao=new UserDOAImpl();
    }

    @Override
    public boolean isUserValid(String email, String password) {
       return userdao.isUserValid(email, password);
    }
    
}
