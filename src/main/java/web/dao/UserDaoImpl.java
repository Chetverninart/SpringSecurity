package web.dao;

import org.springframework.stereotype.Component;
import web.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class UserDaoImpl implements UserDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    public User findByUsername(String username) {

        return (User) em.createQuery("SELECT u FROM User u where u.username = :value")
                .setParameter("value", username).getSingleResult();
    }

}
