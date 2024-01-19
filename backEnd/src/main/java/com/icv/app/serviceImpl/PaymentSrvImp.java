package com.icv.app.serviceImpl;

import com.icv.app.db.PaymentDB;
import com.icv.app.db.loginDB;
import com.icv.app.model.PaymentData;
import com.icv.app.repository.LoginRepository;
import com.icv.app.repository.PaymentRepository;
import com.icv.app.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentSrvImp implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepo;

    @Autowired
    private LoginRepository loginRepo;

    @Override
    public void addPayment(PaymentData paymentData) {
        PaymentDB paymentDB = new PaymentDB();
        paymentDB.setId(paymentData.getId());
        paymentDB.setPayment(paymentData.getPayment());

        loginDB logdb = loginRepo.findByusername(paymentData.getUserName());
        paymentDB.setUserName(logdb);

        paymentRepo.save(paymentDB);

    }
}
