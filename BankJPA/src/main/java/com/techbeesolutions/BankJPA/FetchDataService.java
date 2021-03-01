package com.techbeesolutions.BankJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Component
public interface FetchDataService extends JpaRepository<BankUserModel, Integer> {

    @Override
    List<BankUserModel> findAll();

//    List<BankUserModel> findByANum(int num);



}
