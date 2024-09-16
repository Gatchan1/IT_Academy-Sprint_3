package tasca1.n2.datafactories;

import tasca1.n2.addresses.Address;
import tasca1.n2.addresses.PolandAddress;
import tasca1.n2.phones.PolandPhone;
import tasca1.n2.phones.Phone;

public class PolandDataFactory implements DataFactory {
    @Override
    public Phone createPhone(String number) {
        return new PolandPhone(number);
    }

    @Override
    public Address createAddress(String street, int houseNumber, String floorAndDoor, String postalCode, String city) {
        return new PolandAddress(street, houseNumber, floorAndDoor, postalCode, city);
    }
}
