public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public void save(Customer customer) {
        System.out.println("Saving customer: " + customer.getName());
    }
}
