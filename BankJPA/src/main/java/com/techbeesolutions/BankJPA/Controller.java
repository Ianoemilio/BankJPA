package com.techbeesolutions.BankJPA;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class Controller {


    @Autowired
    protected service FetchData;

    @GetMapping(path = "getdata")
    public List<UserModel> getAllUsers() {
        return FetchData.getAll();
    }

    @PostMapping(path = "postdata")
    public UserModel load(@RequestBody UserModel user) {
        return FetchData.addUser(user);
    }

    @DeleteMapping(path = "removedata")
    public String removeUser(@PathVariable int id) {
        return FetchData.deleteUser(id);
    }

    @PutMapping(path = "updatedata")
    public UserModel updateUser(@RequestBody UserModel user) {
        return FetchData.updateUser(user);
    }

}
