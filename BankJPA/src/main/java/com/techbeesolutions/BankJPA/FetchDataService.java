package com.techbeesolutions.BankJPA;


import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface fetchDataService extends JpaRepository<UserModel, String>  {

    @Override
    List<UserModel> findAll();

    String deleteById(int id);

    UserModel findById(int id);
}
