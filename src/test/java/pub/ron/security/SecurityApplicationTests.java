package pub.ron.security;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pub.ron.security.domain.Authority;
import pub.ron.security.domain.User;
import pub.ron.security.service.UserService;

import java.util.Collections;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SecurityApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
        User user = new User();
        user.setUsername("ron");
        user.setPassword("123");
        Authority authority = new Authority();
        authority.setAuthority("admin");
        authority.setUser(user);
        user.setAuthorities(Collections.singletonList(authority));
        userService.register(user);

    }

}

