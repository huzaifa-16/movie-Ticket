package com.icv.app.repository;

import com.icv.app.db.TicketDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface TicketRepository extends JpaRepository<TicketDB, String> {
    @Query(value = "SELECT EXISTS(SELECT * FROM ticketdb WHERE id=:Id)",nativeQuery=true)
    Boolean existsById(Integer Id);



    @Transactional
    @Modifying
    @Query(value ="UPDATE  ticketdb set count =:Count  where id=:Id ",nativeQuery=true )
    void updateTicketCount(Integer Id, Integer Count);


    @Transactional
    @Modifying
    @Query(value ="DELETE from  ticketdb   where id=:Id ",nativeQuery=true )
    void deleteTicket(Integer Id);




    //update
    @Transactional
    @Modifying
    @Query(value ="UPDATE  ticketdb set count =:Count  where id=:Id ",nativeQuery=true )
    void updateTicket(Integer Id, Integer Count);




    @Query(value = "SELECT * FROM ticketdb where id=:Id",nativeQuery=true)
    TicketDB findByIdno(Integer Id );




}
