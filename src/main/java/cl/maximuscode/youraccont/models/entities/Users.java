package cl.maximuscode.youraccont.models.entities;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @Column(name = "id_user")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUser;
    @Column(unique = true)
    private String email;
    @Column(name = "password_user")
    private String password;
    @Column(name = "name_user")
    private String name;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<AccountsUser> accounts = new ArrayList<>();

    //Constructor con id

    public Users(Integer idUser, String email, String password, String name, List<AccountsUser> accounts) {
        this.idUser = idUser;
        this.email = email;
        this.password = password;
        this.name = name;
        this.accounts = accounts;
    }

    //Constructor sin id
    public Users(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public Users() {
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AccountsUser> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<AccountsUser> accounts) {
        this.accounts = accounts;
    }
}
