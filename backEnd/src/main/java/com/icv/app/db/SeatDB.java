package com.icv.app.db;


import javax.persistence.*;

@Entity
@Table(name = "SeatDB")
public class SeatDB {

    @Id
    @Column(name = "Id")
    private Integer Id;

    @Column(name = "Seat")
    private Integer Seat;

    @ManyToOne
    @JoinColumn(name = "MovieName")
    private DashBoardDB MovieName;

    @ManyToOne
    @JoinColumn(name = "date")
    private DashBoardDB date;

    @ManyToOne
    @JoinColumn(name = "UserName")
    private loginDB UserName;

    public SeatDB(Integer id, Integer seat, DashBoardDB movieName, DashBoardDB date, loginDB userName) {
        Id = id;
        Seat = seat;
        MovieName = movieName;
        this.date = date;
        UserName = userName;
    }

    public SeatDB()
    {

    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getSeat() {
        return Seat;
    }

    public void setSeat(Integer seat) {
        Seat = seat;
    }

    public DashBoardDB getMovieName() {
        return MovieName;
    }

    public void setMovieName(DashBoardDB movieName) {
        MovieName = movieName;
    }

    public DashBoardDB getDate() {
        return date;
    }

    public void setDate(DashBoardDB date) {
        this.date = date;
    }

    public loginDB getUserName() {
        return UserName;
    }

    public void setUserName(loginDB userName) {
        UserName = userName;
    }
}
