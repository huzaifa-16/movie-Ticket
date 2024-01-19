package com.icv.app.service;

import com.icv.app.model.LoginData;

public interface loginService {

    public void addUserName(LoginData loginData);

    public void EnableUserName(LoginData loginData);

    public void DisableUserName(LoginData loginData);


}
