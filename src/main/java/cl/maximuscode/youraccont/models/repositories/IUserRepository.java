package cl.maximuscode.youraccont.models.repositories;

import cl.maximuscode.youraccont.models.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IUserRepository extends JpaRepository<Users, Integer> {
    Users findByName(String name);
}
