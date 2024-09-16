package tasca1.n2.addresses;

public class SpainAddress extends Address {
    public SpainAddress(String street, int houseNumber, String floorAndDoor, String postalCode, String city) {
        super(street, houseNumber, floorAndDoor, postalCode, city);
        country = "Spain";
    }
}
