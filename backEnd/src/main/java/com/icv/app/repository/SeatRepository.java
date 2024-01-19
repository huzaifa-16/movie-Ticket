package com.icv.app.repository;

import com.icv.app.db.SeatDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SeatRepository extends JpaRepository<SeatDB,Integer> {

    @Query(value = "SELECT EXISTS(SELECT * FROM seatdb WHERE id=:Id)",nativeQuery=true)
    Boolean exsistsById(Integer Id);
}
