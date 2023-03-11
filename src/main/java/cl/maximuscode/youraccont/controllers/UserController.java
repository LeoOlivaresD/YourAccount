package cl.maximuscode.youraccont.controllers;
import cl.maximuscode.youraccont.models.entities.Users;
import cl.maximuscode.youraccont.models.service.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UsersServices usersServices;

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView createUser() {
        ModelAndView model = new ModelAndView();
        Users users = new Users();
        model.addObject("userForm", users);
        model.setViewName("userRegister");
        return model;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView showUser() {
        ModelAndView model = new ModelAndView();
        List<Users> users = usersServices.readAll();
        model.addObject("userForm", users);
        model.setViewName("listUsers");
        return model;
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public ModelAndView updateUser(@PathVariable Integer id) {
        ModelAndView model = new ModelAndView();
        Optional<Users> users = usersServices.readOne(id);
        model.addObject("userForm", users);
        model.setViewName("userRegister");
        return model;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView saveUserUpdate(@ModelAttribute("userForm") Users users) {
        if (users.getIdUser() != null) {
            usersServices.update(users);
        } else {
            usersServices.create(users);
        }
        return new ModelAndView("redirect:/interface/create");
    }

}
