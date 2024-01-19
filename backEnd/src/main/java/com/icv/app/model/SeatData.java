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
public class SeatData {
    private static final long serialVersionUID = 1L;


    @JsonProperty("Id")
    private Integer Id;

    @JsonProperty("MovieName")
    private String MovieName;

    @JsonProperty("date")
    private String date;

    @JsonProperty("Seat")
    private int Seat;

    @JsonProperty("UserName")
    private String UserName;
}
