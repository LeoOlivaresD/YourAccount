package cl.maximuscode.youraccont.models.service;
import cl.maximuscode.youraccont.models.entities.AccountsUser;
import cl.maximuscode.youraccont.models.repositories.IAccountsUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AccountsUserService {
    @Autowired
    private IAccountsUserRepository accountRepo;

    public void create(AccountsUser account){
        accountRepo.save(account);
    }
    public List<AccountsUser> readAll(){
        return accountRepo.findAll();
    }
    public Optional<AccountsUser> readOne(Integer accountId){
        return accountRepo.findById(accountId);
    }

    public void update(AccountsUser account){
        accountRepo.save(account);
    }
    public void delete(Integer id){
        accountRepo.deleteById(id);
    }
}
