package tasca1.n2.datafactories;

import tasca1.n2.Address;
import tasca1.n2.Phone;

public interface DataFactory {
    Phone createPhone(String number);
    Address createAddress(String street, int houseNumber, String floorAndDoor, String postalCode, String city);
}
