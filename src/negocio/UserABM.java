package negocio;

import java.util.List;
import dao.UserDao;
import datos.User;

public class UserABM {
    UserDao dao = new UserDao();

    public User traer(int idUser) {
        return dao.traer(idUser);
    }

    public List<User> traer() {
        return dao.traer();
    }

    public int agregar(String username, String password) throws Exception {
        User user = new User(username, password);
        return dao.agregar(user);
    }

    public void actualizar(User user) throws Exception {
        if (traer(user.getIdUser()) == null) {
            throw new Exception("Error: el usuario asignado no existe.");
        }
        dao.actualizar(user);
    }

    public void actualizarUsername(User user, String username) throws Exception {
        user.setUsername(username);
        actualizar(user);
    }

    public void actualizarPassword(User user, String password) throws Exception {
        user.setPassword(password);
        actualizar(user);
    }
}
