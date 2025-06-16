package dao;

import datos.Admin;

public class AdminDao extends Dao<Admin> {

    public Admin traerPorUsuario(int idUser) {
        Admin objeto = new datos.Admin();
        try {
            iniciaOperacion();
            objeto = (Admin) session.createQuery("from Admin a where a.user.idUser = :idUser")
                    .setParameter("idUser", idUser).uniqueResult();
        } finally {
            session.close();
        }
        return objeto;
    }

    public Admin traerPorArea(String areaName) {
        Admin objeto = new datos.Admin();
        try {
            iniciaOperacion();
            objeto = (Admin) session.createQuery("from Admin a where a.area.area = :areaName")
                    .setParameter("areaName", areaName).uniqueResult();
        } finally {
            session.close();
        }
        return objeto;
    }

    @Override
    public int agregar(Admin admin) {
        try {
            iniciaOperacion();
            // Save the associated User first
            session.save(admin.getUser());
            // Save the Admin
            int id = (int) session.save(admin);
            tx.commit();
            return id;
        } finally {
            session.close();
        }
    }
}
