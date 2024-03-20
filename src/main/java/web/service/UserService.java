package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    void deleteUser(Long id);
    void saveUser(User user);
    User getUser(Long id);
}
