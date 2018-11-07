package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/allUser")
    public String list(Model model){
        List<User> list = userService.findAllUsers();
        model.addAttribute("list",list);
        return "allUser";
    }

    @RequestMapping("/toAddUser")
    public String toAddUser(){
        return "addUser";
    }

    @RequestMapping("/addUser")
    public String addUser(User user){
        userService.addUser(user);
        return "redirect:/user/allUser";
    }

    @RequestMapping("/del/{userId}")
    public String deleteUser(@PathVariable("userId") String id){
        userService.deleteUserById(id);
        return "redirect:/user/allUser";
    }

    @RequestMapping("toUpdateUser")
    public String toUpdateUser(Model model,String id){
        model.addAttribute("user",userService.findUserById(id));
        return "updateUser";
    }

    @RequestMapping("/updateUser")
    public String updateUser(Model model,User user){
        userService.updateUser(user);
        user = userService.findUserById(user.getId());
        model.addAttribute("user",user);
        return "redirect:/user/allUser";
    }
}
