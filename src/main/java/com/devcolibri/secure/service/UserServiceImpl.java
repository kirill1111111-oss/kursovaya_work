package com.devcolibri.secure.service;
import com.devcolibri.secure.entity.Userr;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public Userr getUser(String login) {
        Userr user = new Userr();
        user.setLogin(login);
        user.setPassword("7110eda4d09e062aa5e4a390b0a572ac0d2c0220");
        return user;
    }
}
