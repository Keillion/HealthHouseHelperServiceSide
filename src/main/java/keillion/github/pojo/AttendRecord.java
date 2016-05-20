package keillion.github.pojo;

import java.util.Date;

public class AttendRecord {
    private Long id;

    private Long costomer;

    private Integer house;

    private Long card;

    private Integer people;

    private Integer cost;

    private Date time;

    private Long correct;

    private Integer isdisable;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCostomer() {
        return costomer;
    }

    public void setCostomer(Long costomer) {
        this.costomer = costomer;
    }

    public Integer getHouse() {
        return house;
    }

    public void setHouse(Integer house) {
        this.house = house;
    }

    public Long getCard() {
        return card;
    }

    public void setCard(Long card) {
        this.card = card;
    }

    public Integer getPeople() {
        return people;
    }

    public void setPeople(Integer people) {
        this.people = people;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Long getCorrect() {
        return correct;
    }

    public void setCorrect(Long correct) {
        this.correct = correct;
    }

    public Integer getIsdisable() {
        return isdisable;
    }

    public void setIsdisable(Integer isdisable) {
        this.isdisable = isdisable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}