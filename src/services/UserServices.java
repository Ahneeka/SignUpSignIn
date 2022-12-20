package services;

import data.model.User;

public interface UserServices {
    String createUser(String firstName, String lastName, String password, String email);
    User findByEmail(String email);
    void deleteByEmail(String email);

}
