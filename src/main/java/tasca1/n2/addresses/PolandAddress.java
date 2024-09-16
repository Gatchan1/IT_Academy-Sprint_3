package tasca1.n2.addresses;

public class PolandAddress extends Address {
    public PolandAddress(String street, int houseNumber, String floorAndDoor, String postalCode, String city) {
        super(street, houseNumber, floorAndDoor, postalCode, city);
        country = "Poland";
    }
}
