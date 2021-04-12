/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author davidcuba
 */
public class User {

    public String date_of_birth;
    public String full_name;
    public String nickname;

    public User(String dateOfBirth, String fullName) {
        this.date_of_birth = dateOfBirth;
        this.full_name = fullName;
    }

    public User(String dateOfBirth, String fullName, String nickname) {
        this.date_of_birth = dateOfBirth;
        this.full_name = fullName;
        this.nickname = nickname;
    }
}
