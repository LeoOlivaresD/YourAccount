package cl.maximuscode.youraccont.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "accounts_user")
public class AccountsUser {
    @Id
    @Column(name = "account_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountId;
    @Column(name = "type_account")
    private String typeAccount;
    @Column(name = "name_account")
    private String nameAccount;
    @Column(name = "email_account")
    private String emailAccount;
    @Column(name = "username_account")
    private String userNameAccount;
    @Column(name = "password_account")
    private String userPasswAccount;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users user;

    public AccountsUser() {
    }

    public AccountsUser(Integer accountId, String typeAccount, String nameAccount, String emailAccount, String userNameAccount, String userPasswAccount) {
        this.accountId = accountId;
        this.typeAccount = typeAccount;
        this.nameAccount = nameAccount;
        this.emailAccount = emailAccount;
        this.userNameAccount = userNameAccount;
        this.userPasswAccount = userPasswAccount;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    public String getEmailAccount() {
        return emailAccount;
    }

    public void setEmailAccount(String emailAccount) {
        this.emailAccount = emailAccount;
    }

    public String getUserNameAccount() {
        return userNameAccount;
    }

    public void setUserNameAccount(String userNameAccount) {
        this.userNameAccount = userNameAccount;
    }

    public String getUserPasswAccount() {
        return userPasswAccount;
    }

    public void setUserPasswAccount(String userPasswAccount) {
        this.userPasswAccount = userPasswAccount;
    }


}
