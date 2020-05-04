package com.example.user.service;

import com.example.user.dao.FakeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final FakeRepo fakeRepo;

    @Autowired
    public UserServiceImpl(@Qualifier("fakeDao") FakeRepo fakeRepo) {
        this.fakeRepo = fakeRepo;
    }


    @Override
    public void addUser(String name, String surname) {
        fakeRepo.insertUser(name, surname);
    }

    @Override
    public void getUser(Long id) {
        fakeRepo.findUserById(id);
    }

    @Override
    public void removeUser(Long id) {
        fakeRepo.deleteUser(id);
    }

}
