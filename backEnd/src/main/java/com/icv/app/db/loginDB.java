package com.icv.app.db;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "login")
public class loginDB {
    @Id
    @Column(name = "UserName")
    private String UserName;

    @Column(name = "passWord")
    private String passWord;

    @Column(name = "Status")
    private Boolean Status;


    public loginDB()
    {

    }

    public loginDB(String userName, String passWord, Boolean status) {
        UserName = userName;
        this.passWord = passWord;
        Status = status;
    }

    public String getUserName() {
        return UserName;
    }

    public Boolean getStatus() {
        return Status;
    }

    public void setStatus(Boolean status) {
        Status = status;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
