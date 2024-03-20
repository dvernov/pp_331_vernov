//package web;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import web.config.AppConfig;
//import web.model.User;
//import web.service.UserService;
//
//import java.lang.reflect.Array;
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//
//        UserService userService = context.getBean(UserService.class);
//        userService.deleteUser(2L);
//        userService.deleteUser(3L);
//        context.close();
//
//    }
//}
