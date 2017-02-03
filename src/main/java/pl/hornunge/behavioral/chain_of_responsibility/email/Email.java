package pl.hornunge.behavioral.chain_of_responsibility.email;

public class Email {
    private String addressFrom;

    public Email(String addressFrom) {
        this.addressFrom = addressFrom;
    }

    public String getAddressFrom() {
        return addressFrom;
    }
}
