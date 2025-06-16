package dao;

import datos.Employee;
import datos.User;

public class EmployeeDao extends Dao<Employee> {

    public Employee traerPorUsuario(int idUser) {
        Employee objeto = new datos.Employee();
        try {
            iniciaOperacion();
            objeto = (Employee) session.createQuery("from Employee e where e.user.idUser = :idUser")
                    .setParameter("idUser", idUser).uniqueResult();
        } finally {
            session.close();
        }
        return objeto;
    }

    @Override
    public int agregar(Employee employee) {
        try {
            iniciaOperacion();
            // Save the associated User first
            session.save(employee.getUser());
            // Save the Employee
            int id = (int) session.save(employee);
            tx.commit();
            return id;
        } finally {
            session.close();
        }
    }
}
