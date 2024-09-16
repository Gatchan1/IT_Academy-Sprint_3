package tasca1.n2.datafactories;

import tasca1.n2.addresses.DenmarkAddress;
import tasca1.n2.addresses.Address;
import tasca1.n2.phones.DenmarkPhone;
import tasca1.n2.phones.Phone;

public class DenmarkDataFactory implements DataFactory {
    @Override
    public Phone createPhone(String number) {
        return new DenmarkPhone(number);
    }

    @Override
    public Address createAddress(String street, int houseNumber, String floorAndDoor, String postalCode, String city) {
        return new DenmarkAddress(street, houseNumber, floorAndDoor, postalCode, city);
    }
}
