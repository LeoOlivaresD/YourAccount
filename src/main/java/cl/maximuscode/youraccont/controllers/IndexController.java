package cl.maximuscode.youraccont.controllers;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(){
        return new ModelAndView("index");
    }
    @RequestMapping(path = "/login" , method = RequestMethod.GET)
    public ModelAndView login(){
        return new ModelAndView("login");
    }

    /*@RequestMapping(value = "/login" , method = RequestMethod.POST)
    public ModelAndView successLogin(){
        return new ModelAndView("redirect:/user/create");
    }*/
    @RequestMapping(path = "/error")
    public ModelAndView errorLogin(){
        return new ModelAndView("login","error","true");
    }

    @RequestMapping(path = "/logout")
    public ModelAndView logout(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null){
            SecurityContextHolder.getContext().setAuthentication(null);
        }return new ModelAndView("redirect:/login");
    }
}
