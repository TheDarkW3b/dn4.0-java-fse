public class DependencyInjectionTest {
    public static void main(String[] args) {
        // Inject dependency manually
        CustomerRepository repo = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repo);

        service.registerCustomer("Ramit Gangwar");
    }
}
