package keillion.github.pojo;

import java.util.Date;

public class Card {
    private Long id;

    private Long owner;

    private Integer cclass;

    private Integer house;

    private Integer value;

    private Integer seller;

    private String description;

    private Date expires;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOwner() {
        return owner;
    }

    public void setOwner(Long owner) {
        this.owner = owner;
    }

    public Integer getCclass() {
        return cclass;
    }

    public void setCclass(Integer cclass) {
        this.cclass = cclass;
    }

    public Integer getHouse() {
        return house;
    }

    public void setHouse(Integer house) {
        this.house = house;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getSeller() {
        return seller;
    }

    public void setSeller(Integer seller) {
        this.seller = seller;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getExpires() {
        return expires;
    }

    public void setExpires(Date expires) {
        this.expires = expires;
    }
}