package keillion.github.pojo;

public class House {
    private Integer id;

    private String name;

    private String icon;

    private String country;

    private String province;

    private String city;

    private String distract;

    private String detailaddr;

    private String email;

    private String phone;

    private String description;

    private String album;

    private Integer manager;

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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistract() {
        return distract;
    }

    public void setDistract(String distract) {
        this.distract = distract == null ? null : distract.trim();
    }

    public String getDetailaddr() {
        return detailaddr;
    }

    public void setDetailaddr(String detailaddr) {
        this.detailaddr = detailaddr == null ? null : detailaddr.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album == null ? null : album.trim();
    }

    public Integer getManager() {
        return manager;
    }

    public void setManager(Integer manager) {
        this.manager = manager;
    }
}