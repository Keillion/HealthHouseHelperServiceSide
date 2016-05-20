package keillion.github.pojo;

import java.util.Date;

public class UserDefStatistics {
    private Long id;

    private String title;

    private Integer year;

    private Integer quarter;

    private Integer month;

    private Integer date;

    private Integer week;

    private Integer day;

    private Date starttime;

    private Date endtime;

    private Integer house;

    private Integer seller;

    private Long costomer;

    private Long card;

    private Long income;

    private Long numoftimes;

    private Long numoftimes2;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getQuarter() {
        return quarter;
    }

    public void setQuarter(Integer quarter) {
        this.quarter = quarter;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getHouse() {
        return house;
    }

    public void setHouse(Integer house) {
        this.house = house;
    }

    public Integer getSeller() {
        return seller;
    }

    public void setSeller(Integer seller) {
        this.seller = seller;
    }

    public Long getCostomer() {
        return costomer;
    }

    public void setCostomer(Long costomer) {
        this.costomer = costomer;
    }

    public Long getCard() {
        return card;
    }

    public void setCard(Long card) {
        this.card = card;
    }

    public Long getIncome() {
        return income;
    }

    public void setIncome(Long income) {
        this.income = income;
    }

    public Long getNumoftimes() {
        return numoftimes;
    }

    public void setNumoftimes(Long numoftimes) {
        this.numoftimes = numoftimes;
    }

    public Long getNumoftimes2() {
        return numoftimes2;
    }

    public void setNumoftimes2(Long numoftimes2) {
        this.numoftimes2 = numoftimes2;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}