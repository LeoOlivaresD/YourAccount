package cl.maximuscode.youraccont.models.entities;

public class AccountsUser {
    private Integer accountID;
    private String typeAccount;
    private String nameAccount;
    private String emailAccount;
    private String userNameAccount;
    private String userPasswAccount;
    private Integer userID;

    public AccountsUser() {
    }

    public AccountsUser(Integer accountID, String typeAccount, String nameAccount, String emailAccount, String userNameAccount, String userPasswAccount, Integer userID) {
        this.accountID = accountID;
        this.typeAccount = typeAccount;
        this.nameAccount = nameAccount;
        this.emailAccount = emailAccount;
        this.userNameAccount = userNameAccount;
        this.userPasswAccount = userPasswAccount;
        this.userID = userID;
    }

    public Integer getAccountID() {
        return accountID;
    }

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
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

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }
}
