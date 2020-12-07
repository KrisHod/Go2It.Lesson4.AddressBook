package com.go2it.edu;

public class Address {
    public String streetInfo1;
    public String streetInfo2;
    public String city;
    public String postalCode;
    public String province;
    public String country;

    public Address(String streetInfo1, String streetInfo2, String city,
                   String postalCode, String province, String country) {
        this.streetInfo1 = streetInfo1;
        this.streetInfo2 = streetInfo2;
        this.city = city;
        this.postalCode = postalCode;
        this.province = province;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address {" +
                "streetInfo1='" + streetInfo1 + '\'' +
                ", streetInfo2='" + streetInfo2 + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
