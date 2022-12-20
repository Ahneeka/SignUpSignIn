package data.repository;

import data.model.User;

import java.util.HashMap;

public class UserRepository {
    private final HashMap<String, User> userList = new HashMap<>();


    public String saveUser(User user){
        userList.put(user.getEmail(), user);
        return "saved successfull";
    }
    public User findByEmail(String emil ){
        return userList.get(emil);
    }
    public String deleteByKey(String email){
        userList.remove(email);
        return "delete successfully";
    }
}
