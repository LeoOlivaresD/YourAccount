package cl.maximuscode.youraccont.models.repositories;
import cl.maximuscode.youraccont.models.entities.AccountsUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IAccountsUserRepository extends JpaRepository<AccountsUser,Integer> {
    List<AccountsUser> findByUser_IdUser(Integer user_idUser);
}
