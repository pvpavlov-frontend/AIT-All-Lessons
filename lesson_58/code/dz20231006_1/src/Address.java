package dz20231006_1.src;

public class Address {
    private String postcode;
    private String city;
    private String street;
    private String house;

    public Address(String postcode, String city, String street, String house) {
        this.postcode = postcode;
        this.city = city;
        this.street = street;
        this.house = house;
    }

    @Override
    public String toString() {
        return "Address{" +
                "postcode='" + postcode + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                '}';
    }
}