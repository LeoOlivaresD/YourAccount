package cl.maximuscode.youraccont.models.service;

import cl.maximuscode.youraccont.models.entities.Users;
import cl.maximuscode.youraccont.models.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersServices {
    @Autowired
    private IUserRepository iUserRepository;

    public void create(Users users) {
        iUserRepository.save(users);
    }

    public List<Users> readAll() {
        return iUserRepository.findAll();
    }

    public Optional<Users> readOne(Integer idUser) { //Al usar optional prevenimos que se caiga la app si es que hay un id con valor null
        return iUserRepository.findById(idUser);
    }

    public void update(Users users){
        iUserRepository.save(users);
    }

    public void delete(Integer idUser){
        iUserRepository.deleteById(idUser);
    }
}
