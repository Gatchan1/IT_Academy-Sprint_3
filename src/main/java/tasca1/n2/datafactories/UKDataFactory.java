package tasca1.n2.datafactories;

import tasca1.n2.addresses.Address;
import tasca1.n2.addresses.UKAddress;
import tasca1.n2.phones.Phone;
import tasca1.n2.phones.UKPhone;

public class UKDataFactory implements DataFactory {
    @Override
    public Phone createPhone(String number) {
        UKPhone phone = null;
        if (number.matches("^\\+44\\d{10,11}$")) {
            phone = new UKPhone(number);
        }
        return phone;
    }

    @Override
    public Address createAddress(String street, int houseNumber, String floorAndDoor, String postalCode, String city) {
        UKAddress address = null;
        if (!street.isEmpty() && !city.isEmpty() && postalCode.matches("^[A-Z][A-Z\\d][1,3]\\s?\\d[A-Z]{2}$")) {
            address = new UKAddress(street, houseNumber, floorAndDoor, postalCode, city);
        }
        return address;
    }
}
