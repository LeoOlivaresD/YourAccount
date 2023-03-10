package cl.maximuscode.youraccont.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/interface")
public class UserAccounts {
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public ModelAndView interfaceUser(){
        return new ModelAndView("interfaceUser");
    }
}
