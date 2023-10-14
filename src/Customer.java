public class Customer {

    private String customerName;
    private double customerCreditLimit;
    private String customerEmail;

    public Customer(String customerName, double customerCreditLimit, String customerEmail) {
        this.customerName = customerName;
        this.customerCreditLimit = customerCreditLimit;
        this.customerEmail = customerEmail;
    }

    public Customer() {
        this("Mahabir Gupta",20000,"mahabirg81@gmail.com");
    }

    public Customer(String customerName, String customerEmail) {
        this();
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCustomerCreditLimit() {
        return customerCreditLimit;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
}
