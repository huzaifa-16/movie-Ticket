package com.icv.app.repository;

import com.icv.app.db.PaymentDB;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentDB,Integer> {


}
