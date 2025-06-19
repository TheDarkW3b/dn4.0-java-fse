public class CustomerService {
    private CustomerRepository repository;

    // Dependency Injection via constructor
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void registerCustomer(String name) {
        Customer customer = new Customer(name);
        repository.save(customer);
    }
}
