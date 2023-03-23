package cl.maximuscode.youraccont.controllers;

import cl.maximuscode.youraccont.models.entities.Users;
import cl.maximuscode.youraccont.models.service.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
public class RestUsersController {
    @Autowired
    UsersServices usersServices;

    @PostMapping(value = "/api/create", headers = "Accept=application/json")
    public void create(@RequestBody Users users) {
        usersServices.create(users);
    }


}
