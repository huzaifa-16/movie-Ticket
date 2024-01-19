package com.icv.app.db;


import javax.persistence.*;

@Entity
@Table(name = "TicketDB")
public class TicketDB {

    @Id
    @Column(name = "Id")
    private Integer Id;

    @Column(name = "Count")
    private Integer Count;

    @Column(name = "TotalCount")
    private Integer TotalCount;

    @ManyToOne
    @JoinColumn(name = "MovieName")
    private DashBoardDB MovieName;

    public TicketDB()
    {

    }

    public TicketDB(Integer id, Integer count, Integer totalCount, DashBoardDB movieName) {
        super();
        Id = id;
        Count = count;
        TotalCount = totalCount;
        MovieName = movieName;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getCount() {
        return Count;
    }

    public void setCount(Integer count) {
        Count = count;
    }

    public Integer getTotalCount() {
        return TotalCount;
    }

    public void setTotalCount(Integer totalCount) {
        TotalCount = totalCount;
    }

    public DashBoardDB getMovieName() {
        return MovieName;
    }

    public void setMovieName(DashBoardDB movieName) {
        MovieName = movieName;
    }
}
