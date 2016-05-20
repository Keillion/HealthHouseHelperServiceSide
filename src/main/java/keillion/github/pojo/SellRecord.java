package keillion.github.pojo;

import java.util.Date;

public class SellRecord {
    private Long id;

    private Integer seller;

    private Integer house;

    private Long card;

    private Long customer;

    private Integer isnew;

    private Integer price;

    private Integer value;

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

    public Integer getSeller() {
        return seller;
    }

    public void setSeller(Integer seller) {
        this.seller = seller;
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

    public Long getCustomer() {
        return customer;
    }

    public void setCustomer(Long customer) {
        this.customer = customer;
    }

    public Integer getIsnew() {
        return isnew;
    }

    public void setIsnew(Integer isnew) {
        this.isnew = isnew;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
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