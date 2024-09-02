package tasca1.n2.datafactories;

import tasca1.n2.addresses.Address;
import tasca1.n2.addresses.SpainAddress;
import tasca1.n2.phones.Phone;
import tasca1.n2.phones.SpainPhone;

public class SpainDataFactory implements DataFactory {
    @Override
    public Phone createPhone(String number) {
        SpainPhone phone = null;
        if (number.matches("^\\+34[6789]\\d{8}$")) {
            phone = new SpainPhone(number);
        }
        return phone;
    }

    @Override
    public Address createAddress(String street, int houseNumber, String floorAndDoor, String postalCode, String city) {
        SpainAddress address = null;
        if (!street.isEmpty() && !city.isEmpty() && postalCode.matches("^\\d{5}$")) {
            address = new SpainAddress(street, houseNumber, floorAndDoor, postalCode, city);
        }
        return address;
    }
}
