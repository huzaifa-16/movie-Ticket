package com.icv.app.db;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DashBoardDB")
public class DashBoardDB {

    @Id
    @Column(name = "MovieName")
    private String MovieName;

    @Column(name = "date")
    private String date;

    @Column(name = "Cost")
    private int Cost;



    public DashBoardDB()
    {

    }

    public DashBoardDB(String movieName, String date, int cost) {
        super();
        MovieName = movieName;
        this.date = date;
        Cost = cost;
    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCost() {
        return Cost;
    }

    public void setCost(int cost) {
        Cost = cost;
    }
}
