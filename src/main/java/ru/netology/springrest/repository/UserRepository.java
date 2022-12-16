package ru.netology.springrest.repository;

import org.springframework.stereotype.Repository;
import ru.netology.springrest.domain.Authorities;
import ru.netology.springrest.domain.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepository {

    private ConcurrentHashMap<String, User> listOfUsers = new ConcurrentHashMap<>() {{
        put("Oleg", new User("Oleg", "11111",
                new ArrayList<>() {{
                    add(Authorities.READ);
                }}));
        put("Sveta", new User("Sveta", "55555",
                new ArrayList<>() {{
                    add(Authorities.READ);
                    add(Authorities.DELETE);
                    add(Authorities.WRITE);
                }}));

    }};

    public List<Authorities> getUserAuthorities(String user, String password) {
        if (!listOfUsers.contains(user)) {
            return Collections.emptyList();
        } else if (!listOfUsers.get(user).getPassword().equals(password)) {
            return Collections.emptyList();
        }
        return listOfUsers.get(user).getAuthoritiesList();
    }
}
