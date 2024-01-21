import Impl.UserException;
import Impl.UserServiceImpl;
import model.Gender;
import model.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1,"Aidana",25, Gender.FEMALE);
        User user2 = new User(2,"Max",19,Gender.MALE);
        User user3 = new User(3,"Han",29,Gender.MALE);

        UserServiceImpl userService = new UserServiceImpl();
        userService.addUser(user1);
        userService.addUser(user2);
        userService.addUser(user3);

//        userService.getAllUser();
//        try {
//            System.out.println(userService.getById(4));
//        }catch (UserException e){
//            System.out.println(e.getMessage());
//        }
        System.out.println(userService.removeById(2));
        userService.getAllUser();










    }
}