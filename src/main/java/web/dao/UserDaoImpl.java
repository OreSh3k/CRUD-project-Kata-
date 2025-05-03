package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;


@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    @Override
    public void addUser(User user) {
        em.persist(user);

    }
    @Transactional
    @Override
    public void updateUser(User user) {
        em.merge(user);
    }
    @Transactional
    @Override
    public void deleteUserById(User user, int id) {
        em.remove(em.find(User.class, id));
    }
    @Transactional
    @Override
    public User findUser(int id) {
        return em.find(User.class, id);
    }
    @Transactional
    @Override
    public List<User> getAllUsers() {
        return em.createQuery("select u from User u", User.class).getResultList();
    }
}
