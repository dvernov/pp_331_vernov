package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String showAllUsers(Model model) {
        List<User> userList = userService.getAllUsers();
        model.addAttribute("userList", userList);
        return "index";
    }

    @PostMapping("/register")
    public String addingUser(@ModelAttribute("userForm") User user){
        userService.saveUser(user);
        return "redirect:/";
    }
    @GetMapping("/addUser")
    public String addUser(Model model) {
        User user = new User();
        model.addAttribute("userForm", user);
        return "add-user";
    }

    @PostMapping("/updateUser")
    public String updateUser(@RequestParam(value = "id") Long id, Model model) {
        User user = userService.getUser(id);
        model.addAttribute("userForm", user);
        return "add-user";
    }

    @PostMapping("/deleteUser")
    public String deleteUser(@RequestParam("id") Long id) {
        userService.deleteUser(id);
        return "redirect:/";
    }


}
