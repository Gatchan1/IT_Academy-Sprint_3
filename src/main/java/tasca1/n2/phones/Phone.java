package tasca1.n2.phones;

public abstract class Phone {
    protected String prefix;
    private String number;

    public Phone(String number) {
        this.number = number;
    }

    public String getCompleteNumber() {
        return prefix + " " + number;
    }
    public String getLocalNumber() {
        return number;
    }

    public void setPhoneNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return getCompleteNumber();
    }
}
