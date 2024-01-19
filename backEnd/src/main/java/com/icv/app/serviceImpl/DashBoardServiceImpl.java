package com.icv.app.serviceImpl;


import com.icv.app.db.DashBoardDB;
import com.icv.app.model.DashBoardData;
import com.icv.app.repository.DashBoardRepository;
import com.icv.app.service.DashBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DashBoardServiceImpl implements DashBoardService {

    @Autowired
    private DashBoardRepository dashRepo;

    @Override
    public void addMovie(DashBoardData dashBoardData) {
        DashBoardDB dashBoarddb = new DashBoardDB();
        dashBoarddb.setMovieName(dashBoardData.getMovieName() );
        dashBoarddb.setDate(dashBoardData.getDate() );
        dashBoarddb.setCost(dashBoardData.getCost() );
        dashRepo.save(dashBoarddb);
    }


    @Override
    public int updatecost(DashBoardData dashBoardData) {
        int ress=400;
        if(dashRepo.exsistsByMovieName(dashBoardData.getMovieName()))
        {
            DashBoardDB upcost=dashRepo.findByMovieName(dashBoardData.getMovieName());
            dashRepo.updatecost(dashBoardData.getCost(), dashBoardData.getMovieName());
            ress=200;
        }
        else
        {
            ress=404;
        }
        return ress;
    }
}
