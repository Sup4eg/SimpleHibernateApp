import models.Auto;
import models.User;
import services.UserService;
import utils.HibernateSessionFactoryUtil;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
//        User user = new User("Kirill", 24);
//        userService.saveUser(user);
//        Auto ferrari = new Auto("Ferrary", "red");
//        ferrari.setUser(user);
//        user.addAuto(ferrari);
//        Auto ford = new Auto("Ford", "black");
//        ford.setUser(user);
//        user.addAuto(ford);
//        userService.updateUser(user);
//        user.setName("Sasha");
//        userService.updateUser(user);
//        userService.deleteUser(user);
        System.out.println(userService.findUser(4));
    }
}
