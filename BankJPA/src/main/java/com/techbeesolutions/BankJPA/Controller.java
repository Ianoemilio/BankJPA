package com.techbeesolutions.BankJPA;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class Controller {


    @Autowired
    private fetchDataService FetchData;

    @GetMapping(path = "getdata")
    public List<UserModel> getAllUsers() {
        return FetchData.findAll();
    }


    @GetMapping(path = "/{accountnumber}")
    public Optional<UserModel> find(@PathVariable("accountnumber") int id) {
        return FetchData.findById(id);
    }

    @PostMapping(path = "postdata")
    public UserModel addUser(@RequestBody UserModel user) {
        return FetchData.save(user);
    }

    @DeleteMapping(path = "removedata/{accountnumber}")
    public void removeUser(@PathVariable("accountnumber") int id) {
        FetchData.deleteById(id);
    }

    @PutMapping(path = "updatedata/{accountnumber}")
    public UserModel updateUser(@PathVariable("accountnumber") int id, @RequestBody UserModel user) {
        return FetchData.save(user);
    }

}
