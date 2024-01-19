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
public class DashBoardData {


    private static final long serialVersionUID = 1L;

    @JsonProperty("MovieName")
    private String MovieName;

    @JsonProperty("date")
    private String date;

    @JsonProperty("Cost")
    private int Cost;
}
