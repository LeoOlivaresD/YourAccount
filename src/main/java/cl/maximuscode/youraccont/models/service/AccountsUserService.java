package cl.maximuscode.youraccont.models.service;

import cl.maximuscode.youraccont.models.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountsUserService {
    @Autowired
    IUserRepository iUserRepository;
}
