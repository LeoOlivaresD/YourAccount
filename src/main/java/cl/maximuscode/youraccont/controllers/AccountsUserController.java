package cl.maximuscode.youraccont.controllers;
import cl.maximuscode.youraccont.models.entities.AccountsUser;
import cl.maximuscode.youraccont.models.service.AccountsUserService;
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
@RequestMapping(value = "/interface")
public class AccountsUserController {
    @Autowired
    private AccountsUserService accountService;

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView create() {
        ModelAndView model = new ModelAndView();
        AccountsUser account = new AccountsUser();
        model.addObject("accountForm", account);
        model.setViewName("interfaceUser");
        return model;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView readAll() {
        ModelAndView model = new ModelAndView();
        List<AccountsUser> account = accountService.readAll();
        model.addObject("accountForm", account);
        model.setViewName("listAccounts");
        return model;
    }

    @RequestMapping(value = "/update/{accountId}", method = RequestMethod.GET)
    public ModelAndView update(@PathVariable Integer accountId) {
        ModelAndView model = new ModelAndView();
        Optional<AccountsUser> account = accountService.readOne(accountId);
        model.addObject("accountForm", account);
        model.setViewName("userRegister");
        return model;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView saveUpdate(@ModelAttribute("accountForm") AccountsUser account) {
        if (account.getAccountId() != null) {
            accountService.update(account);
        } else {
            accountService.create(account);
        }
        return new ModelAndView("redirect:/interface/list");
    }

    @RequestMapping(value = "/delete/{accountId}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable("accountId") Integer accountId) {
        accountService.delete(accountId);
        return new ModelAndView("redirect:/interface/list");
    }

}
