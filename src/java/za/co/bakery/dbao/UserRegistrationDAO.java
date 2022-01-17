/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bakery.dbao;

/**
 *
 * @author student12
 */
public interface UserRegistrationDAO {
    void registerUser(String title, String lastName, String firstName, String email, String password);
}
