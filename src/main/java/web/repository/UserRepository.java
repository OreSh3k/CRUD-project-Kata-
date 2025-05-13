package web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import web.model.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    public List<User> findByName(String name);

    public List<User> findByEmail(String email);

    public List<User> findByNameAndEmail(String username, String email);
}
