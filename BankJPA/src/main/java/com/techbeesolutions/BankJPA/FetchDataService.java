package com.techbeesolutions.BankJPA;


import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface fetchDataService extends JpaRepository<UserModel, Integer>  {

    @Override
    List<UserModel> findAll();

    Optional<UserModel> findById(int id);

    UserModel deleteById(int id);
//
//    UserModel findById(int id);
}
