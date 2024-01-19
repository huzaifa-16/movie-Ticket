package com.icv.app.serviceImpl;


import com.icv.app.db.DashBoardDB;
import com.icv.app.db.TicketDB;
import com.icv.app.model.TicketData;
import com.icv.app.repository.DashBoardRepository;
import com.icv.app.repository.TicketRepository;
import com.icv.app.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketImpl implements TicketService {

    @Autowired
    private TicketRepository ticketRepo;

    @Autowired
    private DashBoardRepository dashRepo;

    @Override
    public TicketData addTicket(TicketData ticketData) {
        DashBoardDB dashBoardDB = dashRepo.findByMovieName(ticketData.getMovieName());
        TicketDB ticketDB=new TicketDB();
        ticketDB.setMovieName(dashBoardDB);
        ticketDB.setId(ticketData.getId());
        ticketDB.setTotalCount(ticketData.getTotalCount());
        ticketDB.setCount(ticketData.getCount());


        if(ticketRepo.existsById(ticketData.getId()))
        {

            TicketDB existingTicketData=ticketRepo.findByIdno(ticketData.getId());
            int count = existingTicketData.getTotalCount()-ticketData.getCount();
            System.out.println("count "+count);
            ticketRepo.updateTicket(ticketData.getId(),count );
        }
        else
        {
            ticketRepo.save(ticketDB);
        }


        return ticketData;
    }


}
