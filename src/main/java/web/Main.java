//package web;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import web.DAO.UserDAO;
//import web.DAO.UserDAOImpl;
//import web.config.AppConfig;
//import web.model.User;
//import web.service.UserService;
//import web.service.UserServiceImpl;
//
//public class Main {
//    public static void main(String[] args) {
//
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//
//        UserService userService = context.getBean(UserService.class);
//        userService.addUser(new User("vasya", "petrov"));
//        context.close();
//
//    }
//}
