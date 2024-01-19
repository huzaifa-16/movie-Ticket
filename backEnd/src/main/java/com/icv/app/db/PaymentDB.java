package com.icv.app.db;


import javax.persistence.*;

@Entity
@Table(name = "PaymentDB")
public class PaymentDB {

    @Id
    @Column(name = "Id")
    private Integer Id;

    @Column(name = "Payment")
    private Integer Payment;



    @ManyToOne
    @JoinColumn(name = "UserName")
    private loginDB UserName;

    public PaymentDB()
    {

    }

    public PaymentDB(Integer id, Integer payment, loginDB userName) {
        Id = id;
        Payment = payment;
        UserName = userName;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getPayment() {
        return Payment;
    }

    public void setPayment(Integer payment) {
        Payment = payment;
    }

    public loginDB getUserName() {
        return UserName;
    }

    public void setUserName(loginDB userName) {
        UserName = userName;
    }
}
