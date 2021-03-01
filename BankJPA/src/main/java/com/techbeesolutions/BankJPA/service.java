package com.techbeesolutions.BankJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class service {

    @Autowired
    private fetchDataService repository;

    public List<UserModel> getAll(){
        return repository.findAll();
    }

    public UserModel addUser(UserModel user) {
        return repository.save(user);
    }

    public String deleteUser(int id) {
        return repository.deleteById(id);
    }

    public UserModel updateUser(UserModel user) {
        UserModel existingUser = repository.findById(user.getAccountnumber());
        existingUser.setFirstname(user.getFirstname());
        return repository.save(existingUser);
    }


}
