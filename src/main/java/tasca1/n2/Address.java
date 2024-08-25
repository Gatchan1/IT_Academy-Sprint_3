package tasca1.n2;

public class Address {
    private String street;
    private int houseNumber;
    private String floorAndDoor;
    private String postalCode;
    private String city;

    public Address(String street, int houseNumber, String floorAndDoor, String postalCode, String city) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.floorAndDoor = floorAndDoor;
        this.postalCode = postalCode;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getFloorAndDoor() {
        return floorAndDoor;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setFloorAndDoor(String floorAndDoor) {
        this.floorAndDoor = floorAndDoor;
    }

    public void setPostalCode(String postCode) {
        this.postalCode = postalCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return  "\n  street: " + street +
                "\n  houseNumber: " + houseNumber +
                "\n  floorAndDoor: " + floorAndDoor +
                "\n  postalCode: " + postalCode +
                "\n  city: " + city;
    }
}
