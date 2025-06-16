package negocio;

import dao.AdminDao;
import datos.Admin;
import datos.User;
import datos.Area;

import java.util.List;

public class AdminABM {
    AdminDao dao = new AdminDao();

    public Admin traer(int idAdmin) {
        return dao.traer(idAdmin);
    }

    public Admin traerPorUsuario(int idUser) {
        return dao.traerPorUsuario(idUser);
    }

    public Admin traerPorArea(String areaName) {
        return dao.traerPorArea(areaName);
    }

    public List<Admin> traer() {
        return dao.traer();
    }

    public int agregar(String name, String username, String password) throws Exception {
        // Create the User object
        User user = new User(username, password);
        // Create the Admin object with User and existing Area
        Admin admin = new Admin(0, name, user);
        return dao.agregar(admin);
    }

    public void actualizar(Admin admin) throws Exception {
        if (traer(admin.getIdAdmin()) == null) {
            throw new Exception("Error: el administrador no existe.");
        }
        dao.actualizar(admin);
    }

    public void eliminar(int idAdmin) throws Exception {
        Admin admin = traer(idAdmin);
        if (admin == null) {
            throw new Exception("Error: el administrador no existe.");
        }
        dao.eliminar(admin);
    }
}
