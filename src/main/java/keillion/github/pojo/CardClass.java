package keillion.github.pojo;

public class CardClass {
    private Integer id;

    private String name;

    private Integer type;

    private Integer iniprice;

    private Integer inivalue;

    private Integer unitprice;

    private Integer maxpeople;

    private String description;

    private Integer validterm;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getIniprice() {
        return iniprice;
    }

    public void setIniprice(Integer iniprice) {
        this.iniprice = iniprice;
    }

    public Integer getInivalue() {
        return inivalue;
    }

    public void setInivalue(Integer inivalue) {
        this.inivalue = inivalue;
    }

    public Integer getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Integer unitprice) {
        this.unitprice = unitprice;
    }

    public Integer getMaxpeople() {
        return maxpeople;
    }

    public void setMaxpeople(Integer maxpeople) {
        this.maxpeople = maxpeople;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getValidterm() {
        return validterm;
    }

    public void setValidterm(Integer validterm) {
        this.validterm = validterm;
    }
}