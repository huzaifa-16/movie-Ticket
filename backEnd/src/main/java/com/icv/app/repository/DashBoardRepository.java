package com.icv.app.repository;

import com.icv.app.db.DashBoardDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface DashBoardRepository extends JpaRepository<DashBoardDB,String> {

    @Query(value = "SELECT EXISTS(SELECT * FROM dash_boarddb WHERE movie_name=:MovieName)",nativeQuery=true)
    Boolean exsistsByMovieName(String MovieName);

    @Query(value = "SELECT * FROM dash_boarddb where movie_name=:MovieName ",nativeQuery=true)
    DashBoardDB findByMovieName(String MovieName );

    @Query(value = "SELECT * FROM dash_boarddb where movie_name=:MovieName AND date=:date ",nativeQuery=true)
    DashBoardDB findByMvdt(String MovieName, String date );

    @Transactional
    @Modifying
    @Query(value ="UPDATE dash_boarddb set cost=:cost WHERE movie_name=:MovieName",nativeQuery=true)
    void updatecost(int cost, String MovieName);

}
