package com.techbeesolutions.BankJPA;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class Controller {


    @Autowired
    private service FetchData;

    @GetMapping(path = "getdata")
    public List<UserModel> getAllUsers() {
        return FetchData.;
    }

    @PostMapping(path = "postdata")
    public UserModel load(@RequestBody UserModel user) {
        return FetchData.(user);
//
//    }

}
