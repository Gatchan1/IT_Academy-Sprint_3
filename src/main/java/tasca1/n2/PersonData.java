package tasca1.n2;

public class PersonData {
    private String name;
    private Phone phone;
    private Address address;

    public PersonData(String name) {
        this.name = name;
    }
    public PersonData(String name, Phone phone) {
        this.name = name;
        this.phone = phone;
    }
    public PersonData(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    public PersonData(String name, Phone phone, Address address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public Phone getPhone() {
        return phone;
    }
    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPhone(Phone phone) {
        this.phone = phone;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Register entry:" +
                    "\n name: " + name +
                    "\n phone: " + phone +
                    "\n address: " + address;
    }
}
