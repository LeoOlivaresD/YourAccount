package cl.maximuscode.youraccont.controllers;


import cl.maximuscode.youraccont.models.service.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class RestUsersController {
    @Autowired
    UsersServices usersServices;


}
