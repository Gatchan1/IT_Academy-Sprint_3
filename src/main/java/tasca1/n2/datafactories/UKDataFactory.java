package tasca1.n2.datafactories;

import tasca1.n2.Address;
import tasca1.n2.Phone;

public class UKDataFactory implements DataFactory {
    @Override
    public Phone createPhone(String number) {
        Phone phone = null;
        if (number.matches("^\\+44\\d{10,11}$")) {
            phone = new Phone(number);
        }
        return phone;
    }

    @Override
    public Address createAddress(String street, int houseNumber, String floorAndDoor, String postalCode, String city) {
        Address address = null;
        if (!street.isEmpty() && !city.isEmpty() && postalCode.matches("^[A-Z][A-Z\\d][1,3]\\s?\\d[A-Z]{2}$")) {
            address = new Address(street, houseNumber, floorAndDoor, postalCode, city);
        }
        return address;
    }
}
