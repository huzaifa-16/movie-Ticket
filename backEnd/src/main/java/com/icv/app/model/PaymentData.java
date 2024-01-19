package com.icv.app.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PaymentData {

    private static final long serialVersionUID = 1L;

    @JsonProperty("UserName")
    private String UserName;

    @JsonProperty("Id")
    private Integer Id;

    @JsonProperty("Payment")
    private Integer Payment;
}
