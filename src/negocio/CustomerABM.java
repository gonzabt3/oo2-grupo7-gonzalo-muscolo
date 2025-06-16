package negocio;

import dao.CustomerDao;
import datos.Customer;
import datos.User;

import java.util.List;

public class CustomerABM {
    CustomerDao dao = new CustomerDao();

    public Customer traer(int idCustomer) {
        return dao.traer(idCustomer);
    }

    public Customer traerPorUsuario(int idUser) {
        return dao.traerPorUsuario(idUser);
    }

    public List<Customer> traer() {
        return dao.traer();
    }

    public int agregar(String name, String email, String username, String password) throws Exception {
        // Create the User object
        User user = new User(username, password);
        // Create the Customer object with User
        Customer customer = new Customer(0, name, email, user);
        return dao.agregar(customer);
    }

    public void actualizar(Customer customer) throws Exception {
        if (traer(customer.getIdCustomer()) == null) {
            throw new Exception("Error: el cliente no existe.");
        }
        dao.actualizar(customer);
    }

    public void eliminar(int idCustomer) throws Exception {
        Customer customer = traer(idCustomer);
        if (customer == null) {
            throw new Exception("Error: el cliente no existe.");
        }
        dao.eliminar(customer);
    }
}
