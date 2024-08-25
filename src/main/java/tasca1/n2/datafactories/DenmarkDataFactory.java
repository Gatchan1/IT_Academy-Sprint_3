package tasca1.n2.datafactories;

import tasca1.n2.Address;
import tasca1.n2.Phone;

public class DenmarkDataFactory implements DataFactory {
    @Override
    public Phone createPhone(String number) {
        Phone phone = null;
        if (number.matches("^\\+45\\d{8}$")) {
            phone = new Phone(number);
        }
        return phone;
    }

    @Override
    public Address createAddress(String street, int houseNumber, String floorAndDoor, String postalCode, String city) {
        Address address = null;
        if (!street.isEmpty() && !city.isEmpty() && postalCode.matches("^\\d{4}$")) {
            address = new Address(street, houseNumber, floorAndDoor, postalCode, city);
        }
        return address;
    }
}
