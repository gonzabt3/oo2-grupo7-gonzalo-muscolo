package dao;

import datos.Customer;

public class CustomerDao extends Dao<Customer> {

    public Customer traerPorUsuario(int idUser) {
        Customer objeto = new datos.Customer();
        try {
            iniciaOperacion();
            objeto = (Customer) session.createQuery("from Customer c where c.user.idUser = :idUser")
                    .setParameter("idUser", idUser).uniqueResult();
        } finally {
            session.close();
        }
        return objeto;
    }

    @Override
    public int agregar(Customer customer) {
        try {
            iniciaOperacion();
            // Save the associated User first
            session.save(customer.getUser());
            // Save the Customer
            int id = (int) session.save(customer);
            tx.commit();
            return id;
        } finally {
            session.close();
        }
    }
}
