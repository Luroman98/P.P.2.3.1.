package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.dao.UserDao;
import web.model.User;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping()
    public String getListUsers(Model model) {
        // Получим всех людей из Dao и отобразим в пердставление с помощью thymeleaf
       // model.addAttribute("users", userDao.listUsers());
        return "users/getListUsers";
    }
}
//    @GetMapping("/{id}")
//    public String getUserById(@PathVariable("id") int id, Model model) {
//        // Получим 1-го человека из Dao и  передадим на отображение в представление
//        model.addAttribute("user", userDao.getUser((long) id));
//        return "users/getUserById";
//    }
//    @GetMapping("/new")
//    public String newUser(Model model) {
//        model.addAttribute("user", new User());
//        return "users/new";
//    }
//    @PostMapping()
//    public String create(@ModelAttribute("user") User user) {
//        userDao.add(user);
//        return "redirect:/users";
//    }
//    @GetMapping("/{id}/edit")
//    public String edit(Model model, @PathVariable("id") Long id) {
//        model.addAttribute("user", userDao.getUser((Long)id));
//        return "users/edit";
//    }
//    @PatchMapping("/{id}")
//    public String update(@ModelAttribute("user") User user, @PathVariable("id") Long id) {
//        userDao.update(id, user);
//        return "redirect:/users";
//    }
//}
