/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bakery.dbao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import za.co.bakery.domain.User;

/**
 *
 * @author student12
 */
public class UserDOAImpl implements UserDOA
{
    private Connection connect = null;
    @Override
    public boolean isUserValid(String email, String password) {
            boolean isValid = false;
//            PreparedStatement statement;
//        try {
//            statement = connect.prepareStatement("SELECT EMAIL, PASSWORD FROM USER EMAIL =?");
//            statement.setString(1, email);
//            statement.setString(2, password);
//            ResultSet rs = statement.executeQuery();
//            
//            String dPassword = "";
//            String dEmail = "";
//            if (rs.next()) {
//                dPassword = rs.getString("PASSWORD");
//                dEmail = rs.getString("USERNAME");
//            }
//            if (!dEmail.equals(email) || !dPassword.equals(password)) {
//                return isValid;
//            } else {
//                 isValid = true;
//            }
//        } catch (SQLException ex) {
//            System.out.println("Error: " + ex.getMessage());
//        }
            return isValid;
    }

    @Override
    public int create(User u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User read(User u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isNewUser(User u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
