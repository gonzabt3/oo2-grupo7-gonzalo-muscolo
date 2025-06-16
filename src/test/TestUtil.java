package test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.HibernateUtil;

public class TestUtil {

    public static void limpiarBaseDeDatos() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.createQuery("DELETE FROM Comentario").executeUpdate();
            session.createQuery("DELETE FROM Ticket").executeUpdate();
            session.createQuery("DELETE FROM Employee").executeUpdate();
            session.createQuery("DELETE FROM Customer").executeUpdate();
            session.createQuery("DELETE FROM Admin").executeUpdate();
            session.createQuery("DELETE FROM Area").executeUpdate();
            session.createQuery("DELETE FROM Status").executeUpdate();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}