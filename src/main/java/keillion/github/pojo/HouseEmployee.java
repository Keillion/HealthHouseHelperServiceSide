package keillion.github.pojo;

public class HouseEmployee {
    private Integer id;

    private Integer house;

    private Integer employee;

    private Integer position;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHouse() {
        return house;
    }

    public void setHouse(Integer house) {
        this.house = house;
    }

    public Integer getEmployee() {
        return employee;
    }

    public void setEmployee(Integer employee) {
        this.employee = employee;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}