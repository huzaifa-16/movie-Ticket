package com.icv.app.repository;

import com.icv.app.db.loginDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface LoginRepository extends JpaRepository<loginDB, String> {

//  @Query(value = "(SELECT * FROM own_tank_users WHERE userid=?)",nativeQuery=true)
//    loginDB returnExistsByuseridAndPassword(String Userid);

    @Query(value = "SELECT * FROM login WHERE user_name=:UserName ",nativeQuery = true)
    loginDB findByusername(String UserName);

    @Transactional
    @Modifying
    @Query(value ="UPDATE login set Status=:flag WHERE user_name=:UserName",nativeQuery = true)
    void  StEnDis(String UserName , boolean flag);
}
