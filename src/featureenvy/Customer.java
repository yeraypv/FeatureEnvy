package featureenvy;

public class Customer {

    private String name;
    private Address address;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFullAddress() {
        return name + address.getAddressInfo();
    }
}
