package dao;

import datos.User;

public class UserDao extends Dao<User> {

    public User traerPorUsername(String username) {
        User objeto = new datos.User();
        try {
            iniciaOperacion();
            objeto = (User) session.createQuery("from User u where u.username = :username")
                    .setParameter("username", username).uniqueResult();
        } finally {
            session.close();
        }
        return objeto;
    }
}
