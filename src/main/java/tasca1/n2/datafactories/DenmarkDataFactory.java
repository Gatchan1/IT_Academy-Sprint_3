package tasca1.n2.datafactories;

import tasca1.n2.addresses.DenmarkAddress;
import tasca1.n2.addresses.Address;
import tasca1.n2.phones.DenmarkPhone;
import tasca1.n2.phones.Phone;

public class DenmarkDataFactory implements DataFactory {
    @Override
    public Phone createPhone(String number) {
        DenmarkPhone phone = null;
        if (number.matches("^\\+45\\d{8}$")) {
            phone = new DenmarkPhone(number);
        }
        return phone;
    }

    @Override
    public Address createAddress(String street, int houseNumber, String floorAndDoor, String postalCode, String city) {
        DenmarkAddress address = null;
        if (!street.isEmpty() && !city.isEmpty() && postalCode.matches("^\\d{4}$")) {
            address = new DenmarkAddress(street, houseNumber, floorAndDoor, postalCode, city);
        }
        return address;
    }
}
