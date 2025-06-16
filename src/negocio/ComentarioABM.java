package negocio;

import dao.ComentarioDao;
import datos.Comentario;
import datos.Employee;
import datos.Ticket;

import java.util.Date;

public class ComentarioABM {
    private ComentarioDao comentarioDao = new ComentarioDao();

    public int agregar(String contenido, Date fechaCreacion, Ticket ticket,Employee employee) throws Exception {
        Comentario comentario = new Comentario(contenido, fechaCreacion, ticket,employee);
        return comentarioDao.agregar(comentario);
    }

    public Comentario traerPorContenido(String contenido) {
        return comentarioDao.traerPorContenido(contenido);
    }
}
