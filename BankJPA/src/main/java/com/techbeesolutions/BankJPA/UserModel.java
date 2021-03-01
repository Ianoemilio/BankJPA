package com.techbeesolutions.BankJPA;

import javax.persistence.*;

@Entity
@Table(name = "userTable")
public class UserModel {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Column(name = "Balance")
    private Integer Balance;

    @Column(name = "FirstName")
    private String FirstName;

    @Column(name = "LastName")
    private String LastName;

    @Column(name = "Email")
    private String Email;

    @Column(name = "AccountNumber")
    private Integer AccountNumber;

    @Column(name = "PhoneNumber")
    private String PhoneNumber;

    public Integer getBalance() {
        return Balance;
    }

    public void setBalance(Integer balance) {
        this.Balance = balance;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Integer getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
