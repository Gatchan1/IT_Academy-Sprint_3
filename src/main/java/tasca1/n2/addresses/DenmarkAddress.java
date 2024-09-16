package tasca1.n2.addresses;

public class DenmarkAddress extends Address {
    public DenmarkAddress(String street, int houseNumber, String floorAndDoor, String postalCode, String city) {
        super(street, houseNumber, floorAndDoor, postalCode, city);
        country = "Denmark";
    }
}
