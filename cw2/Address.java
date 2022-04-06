package PGO_12c.cw2;

public class Address {

    private String country;
    private String city;
    private String street;
    private int house;
    private int flat;

    public Address(String country, String city, String street, int house, int flat) {
        setCountry(country);
        setCity(city);
        setStreet(street);
        setHouse(house);
        setFlat(flat);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if(country == null || country.isEmpty()) {
            throw new ValidationException("Country must not be empty");
        }
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if(city == null || city.isEmpty()) {
            throw new ValidationException("City must not be empty");
        }
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        if(house <= 0) {
            throw new ValidationException("Incorrect house number");
        }
        this.house = house;
    }

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }
}
