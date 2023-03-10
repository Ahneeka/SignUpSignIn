package services;

import data.model.User;
import data.repository.UserRepository;

import java.util.HashMap;

public class UserServicesImpl implements UserServices {
private final UserRepository userRepository = new UserRepository();


//    @Override
//    public String createUser(String firstName, String lastName, String id, String password, String email) {
////        User user = new User(firstName, lastName, id, password, email);
//        User user = new User();
//        user.setFirstName(firstName);
//        user.setLastName(lastName);
//        user.setPassword(password);
//        if (user.getEmail().equals(email))throw new IllegalArgumentException("email already exist ");
//        else {
//            userRepository.saveUser(user);
//        }
//      return "User registered successfully";
//    }


    @Override
    public String createUser(String firstName, String lastName, String password, String email) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setPassword(password);
        if (userRepository.findByEmail(email) != null) throw new IllegalArgumentException("email already exist ");
        else {
            userRepository.saveUser(user);
        }
      return "User registered successfully";
    }

    @Override
    public User login(String email, String password) {
        return userRepository.findByEmail(email);
    }

    @Override
    public void deleteUser(String email) {
        userRepository.deleteByKey(email);
    }

}
