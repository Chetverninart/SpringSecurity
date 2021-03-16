package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.models.User;

@Repository
public interface UserDao {
    User findByUsername(String username);
}
