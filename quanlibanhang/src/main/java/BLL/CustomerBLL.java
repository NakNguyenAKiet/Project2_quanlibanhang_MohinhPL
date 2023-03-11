package BLL;

import DAL.CustomerDAL;
import DTO.Customer;
import java.util.List;

public class CustomerBLL {
    private final CustomerDAL customerDAL = new CustomerDAL();

    /*
    public List<Customer> getAllCustomers() {
        return customerDAL.getAllCustomers();
    }

    public Customer getCustomerById(int customerId) {
        return customerDAL.getCustomerById(customerId);
    }

    public boolean insertCustomer(Customer customer) {
        return customerDAL.insertCustomer(customer);
    }

    public boolean updateCustomer(Customer customer) {
        return customerDAL.updateCustomer(customer);
    }

    public boolean deleteCustomer(int customerId) {
        return customerDAL.deleteCustomer(customerId);
    }
    */
}
