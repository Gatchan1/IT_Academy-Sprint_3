package tasca1.n2.datafactories;

import tasca1.n2.addresses.Address;
import tasca1.n2.addresses.PolandAddress;
import tasca1.n2.phones.PolandPhone;
import tasca1.n2.phones.Phone;

public class PolandDataFactory implements DataFactory {
    @Override
    public Phone createPhone(String number) {
        PolandPhone phone = null;
        if (number.matches("^\\+48\\d{9}$")) {
            phone = new PolandPhone(number);
        }
        return phone;
    }

    @Override
    public Address createAddress(String street, int houseNumber, String floorAndDoor, String postalCode, String city) {
        PolandAddress address = null;
        if (!street.isEmpty() && !city.isEmpty() && postalCode.matches("^\\d{2}-\\d{3}$")) {
            address = new PolandAddress(street, houseNumber, floorAndDoor, postalCode, city);
        }
        return address;
    }
}
