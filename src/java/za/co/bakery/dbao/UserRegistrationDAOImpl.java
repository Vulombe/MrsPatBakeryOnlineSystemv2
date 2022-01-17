/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bakery.dbao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student12
 */
public class UserRegistrationDAOImpl implements UserRegistrationDAO{
    private Connection con = null;
    @Override
    public void registerUser(String title, String lastName, String firstName, String email, String password) {
        try {
            PreparedStatement statement =con.prepareStatement("INSERT INTO USER(col1,col2,col3,col4,col5,col6)VAlUES (?,?,?,?,?)") ;
            
            statement.setInt(1, 1+1);
            statement.setString(2, lastName);
            statement.setString(3, firstName);
            statement.setString(4, title);
            statement.setString(5, email);
            statement.setString(6, password);

        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }finally
        {
            if(con != null)
            {
                try {
                    con.close();
                } catch (SQLException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        }
    }
    
}
