package api;

public class StudentDTO {
    private String name;
    private Long mobile;
    private String country;

    public String getName() {
        return name;
    }

    public Long getMobile() {
        return mobile;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "name='" + name + '\'' +
                ", mobile=" + mobile +
                ", country='" + country + '\'' +
                '}';
    }
}
