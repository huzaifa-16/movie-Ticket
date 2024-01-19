package com.icv.app.serviceImpl;

import com.icv.app.db.DashBoardDB;
import com.icv.app.db.SeatDB;
import com.icv.app.db.loginDB;
import com.icv.app.model.SeatData;
import com.icv.app.repository.DashBoardRepository;
import com.icv.app.repository.LoginRepository;
import com.icv.app.repository.SeatRepository;
import com.icv.app.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatImpl implements SeatService {
    @Autowired
    private SeatRepository seatReapo;

    @Autowired
    private DashBoardRepository dashRepo;

    @Autowired
    private LoginRepository loginRepo;



    @Override
    public void addSeat(SeatData seatData)
    {
        DashBoardDB dashBoardDB = dashRepo.findByMvdt(seatData.getMovieName(), seatData.getDate());
        SeatDB seatdb = new SeatDB();
        seatdb.setMovieName(dashBoardDB);

        seatdb.setDate(dashBoardDB);
        seatdb.setId(seatData.getId());

        seatReapo.save(seatdb);
        System.out.println("jsdfaufi");

        loginDB logdb = loginRepo.findByusername(seatData.getUserName());
        seatdb.setUserName(logdb);
        seatdb.setSeat(seatData.getSeat());
        seatReapo.save(seatdb);
    }
}
