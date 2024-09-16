package tasca1.n2.datafactories;

import tasca1.n2.addresses.Address;
import tasca1.n2.addresses.SpainAddress;
import tasca1.n2.phones.Phone;
import tasca1.n2.phones.SpainPhone;

public class SpainDataFactory implements DataFactory {
    @Override
    public Phone createPhone(String number) {
        return new SpainPhone(number);
    }

    @Override
    public Address createAddress(String street, int houseNumber, String floorAndDoor, String postalCode, String city) {
        return new SpainAddress(street, houseNumber, floorAndDoor, postalCode, city);
    }
}
