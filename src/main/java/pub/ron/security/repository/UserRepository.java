package pub.ron.security.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pub.ron.security.domain.User;

import javax.persistence.EntityManager;

@Repository
public class UserRepository {
    @Autowired
    private EntityManager entityManager;


    public User findByUsername(String username) {
        return (User) entityManager
                .createQuery("from User where username=:username")
                .setParameter("username", username)
                .getSingleResult();
    }

    public void save(User user) {
        entityManager.persist(user);
    }
}
