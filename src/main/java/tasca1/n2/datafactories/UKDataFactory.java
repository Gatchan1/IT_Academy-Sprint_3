package tasca1.n2.datafactories;

import tasca1.n2.addresses.Address;
import tasca1.n2.addresses.UKAddress;
import tasca1.n2.phones.Phone;
import tasca1.n2.phones.UKPhone;

public class UKDataFactory implements DataFactory {
    @Override
    public Phone createPhone(String number) {
        return new UKPhone(number);
    }

    @Override
    public Address createAddress(String street, int houseNumber, String floorAndDoor, String postalCode, String city) {
        return new UKAddress(street, houseNumber, floorAndDoor, postalCode, city);
    }
}
