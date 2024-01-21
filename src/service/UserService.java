package service;

import model.User;

public interface UserService {
    void addUser(User user);
    User getById(int id);
    String removeById(int id);
    void getAllUser();

}
