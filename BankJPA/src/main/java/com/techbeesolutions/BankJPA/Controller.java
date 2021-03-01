package com.techbeesolutions.BankJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private FetchDataService fetchDataService;
    @GetMapping("/all")
    public List<BankUserModel> getUsers() {
        return fetchDataService.findAll();
    }

//    @GetMapping(value = "/{name}")
//    public BankUserModel findByANum(@PathVariable final int num) {
//        return fetchDataService.findByANum(num);
//    }

//    @PostMapping(value = "/load")
//    public BankUserModel load(@RequestBody final BankUserModel user) {
//        fetchDataService.save(user);
//        return fetchDataService.findByANum(user.getAccNumber());
//    }
}

