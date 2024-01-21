package Impl;

import dao.UserDao;
import model.User;
import service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDao();

    @Override
    public void addUser(User user) {
        userDao.getUsers().add(user);

    }

    @Override
    public User getById(int id) {
        for (int i = 0; i < userDao.getUsers().size(); i++) {
            if (userDao.getUsers().get(i).getId() == id){
                return userDao.getUsers().get(i);
            }
        }
        throw new UserException("Not find id " + id);
    }

    @Override
    public String removeById(int id) {
        for (int i = 0; i < userDao.getUsers().size(); i++) {
            if (userDao.getUsers().get(i).getId() == id){
                userDao.getUsers().remove(userDao.getUsers().get(i));
            }
        }
        return "Удачно удален user по id: " + id ;
    }

    @Override
    public void getAllUser() {
//        for (int i = 0; i < userDao.getUsers().size(); i++) {
//            System.out.println(userDao.getUsers().get(i));
//        }
        for (User user : userDao.getUsers()){
            System.out.println(user);
        }

    }
}
