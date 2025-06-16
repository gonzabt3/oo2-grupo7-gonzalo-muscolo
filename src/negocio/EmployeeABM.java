package negocio;

import dao.EmployeeDao;
import datos.Employee;
import datos.User;

import java.util.List;

public class EmployeeABM {
    EmployeeDao dao = new EmployeeDao();

    public Employee traer(int idEmployee) {
        return dao.traer(idEmployee);
    }

    public Employee traerPorUsuario(int idUser) {
        return dao.traerPorUsuario(idUser);
    }

    public List<Employee> traer() {
        return dao.traer();
    }

    public int agregar(String name, String position, Double salary, String username, String password) throws Exception {
        // Create the User object
        User user = new User(username, password);
        // Create the Employee object with the User
        Employee employee = new Employee(0, name, position, salary, user);
        return dao.agregar(employee);
    }

    public void actualizar(Employee employee) throws Exception {
        if (traer(employee.getId()) == null) {
            throw new Exception("Error: el empleado no existe.");
        }
        dao.actualizar(employee);
    }

    public void eliminar(int idEmployee) throws Exception {
        Employee employee = traer(idEmployee);
        if (employee == null) {
            throw new Exception("Error: el empleado no existe.");
        }
        dao.eliminar(employee);
    }
}
