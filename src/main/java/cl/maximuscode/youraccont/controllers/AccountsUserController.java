package cl.maximuscode.youraccont.controllers;
import cl.maximuscode.youraccont.models.entities.AccountsUser;
import cl.maximuscode.youraccont.models.entities.Users;
import cl.maximuscode.youraccont.models.service.AccountsUserService;
import cl.maximuscode.youraccont.models.service.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/interface")
public class AccountsUserController {
    @Autowired
    private AccountsUserService accountService;
    @Autowired
    private UsersServices usersServices;

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView create(Authentication authentication) {
        String username = authentication.getName();
        Integer userId = usersServices.getUserID(username);
        ModelAndView model = new ModelAndView();
        AccountsUser account = new AccountsUser();
        model.addObject("accountForm", account);
        model.addObject("usedId", userId);
        model.setViewName("interfaceUser");
        return model;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET) //this method will show all the accounts in our database
    public ModelAndView readAll() {
        ModelAndView model = new ModelAndView();
        List<AccountsUser> account = accountService.readAll();
        model.addObject("accountForm", account);
        model.setViewName("listAccounts");
        return model;
    }

    @RequestMapping(value = "/listAccounts", method = RequestMethod.GET)
    public ModelAndView getAccountsByUserId(Authentication authentication) {
        String username = authentication.getName();
        Integer idUser = usersServices.getUserID(username);
        ModelAndView model = new ModelAndView();
        List<AccountsUser> accountsList = accountService.findByUserId(idUser);
        model.addObject("accountsList" , accountsList);
        model.setViewName("listAccounts");
        return model;
    }


    @RequestMapping(value = "/update/{accountId}", method = RequestMethod.GET)
    public ModelAndView update(@PathVariable Integer accountId) {
        ModelAndView model = new ModelAndView();
        Optional<AccountsUser> account = accountService.readOne(accountId);
        model.addObject("accountForm", account);
        model.setViewName("interfaceUser");
        return model;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView saveUpdate(@ModelAttribute("accountForm") AccountsUser account) {
        if (account.getAccountId() != null) {
            accountService.update(account);
        } else {
            accountService.create(account);
        }
        return new ModelAndView("redirect:/interface/listAccounts");
    }

    @RequestMapping(value = "/delete/{accountId}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable("accountId") Integer accountId) {
        accountService.delete(accountId);
        return new ModelAndView("redirect:/interface/listAccounts");
    }

}
