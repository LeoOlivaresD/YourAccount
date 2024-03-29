package cl.maximuscode.youraccont.models.entities;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class Users {
    @Id
    @Column(name = "id_user")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUser;
    private String email;
    @Column(name = "passw")
    private String password;

    private String name;

    //Constructor con id
    public Users(Integer idUser, String email, String password, String name) {
        this.idUser = idUser;
        this.email = email;
        this.password = password;
        this.name = name;
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
}
