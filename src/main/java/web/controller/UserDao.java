package web.controller;

import web.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UserDao {
    @PersistenceContext
    private EntityManager entityManager;
@Transactional
    public List<User> getAll() {
        return entityManager.createQuery("FROM User", User.class).getResultList();
    }
@Transactional
    public User getById(Long id) {
        return entityManager.find(User.class, id);
    }
@Transactional
    public void save(User user) {
        entityManager.persist(user);
    }
@Transactional
    public void update(User user) {
        entityManager.merge(user);
    }
@Transactional
    public void delete(Long id) {
        User user = getById(id);
        if (user != null) {
            entityManager.remove(user);
        }
    }
}