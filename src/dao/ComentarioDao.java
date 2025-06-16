package dao;

import datos.Comentario;

public class ComentarioDao extends Dao<Comentario> {

    public Comentario traerPorContenido(String contenido) {
        Comentario objeto = new datos.Comentario();
        try {
            iniciaOperacion();
            objeto = (Comentario) session.createQuery("from Comentario c where c.contenido = :contenido")
                    .setParameter("contenido", contenido).uniqueResult();
        } finally {
            session.close();
        }
        return objeto;
    }

    @Override
    public int agregar(Comentario comentario) {
        try {
            iniciaOperacion();
            int id = (int) session.save(comentario);
            tx.commit();
            return id;
        } finally {
            session.close();
        }
    }
}
