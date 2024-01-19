package com.icv.app.serviceImpl;


import com.icv.app.db.loginDB;
import com.icv.app.model.LoginData;
import com.icv.app.repository.LoginRepository;
import com.icv.app.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class loginServiceImpl implements loginService
{
    @Autowired
    private LoginRepository loginRepo;

    @Override
    public void addUserName(LoginData loginData) {
        loginDB logdb = new loginDB();
        logdb.setUserName(loginData.getUserName() );
        logdb.setPassWord(loginData.getPassWord());


        loginRepo.save(logdb);
    }

    @Override
    public void EnableUserName(LoginData loginData) {
        loginDB dash = loginRepo.findByusername(loginData.getUserName());
        if(dash != null)
        {
            loginRepo.StEnDis(loginData.getUserName(), true);
        }
    }

    @Override
    public void DisableUserName(LoginData loginData) {
        loginDB dash = loginRepo.findByusername(loginData.getUserName());
        if(dash != null)
        {
            System.out.println("hiuhuh");
            loginRepo.StEnDis(loginData.getUserName(), false);
        }

    }
}
