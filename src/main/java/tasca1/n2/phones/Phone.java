package tasca1.n2.phones;

public class Phone {
    private String number;

    public Phone(String number) {
        this.number = number;
    }

    public String getPhoneNumber() {
        return number;
    }

    public void setPhoneNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return number;
    }
}
