package services;

import data.model.User;

public interface UserServices {
    String createUser(String firstName, String lastName, String password, String email);
    User login(String email, String password);

    void deleteUser(String email);

}
