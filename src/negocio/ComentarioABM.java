package negocio;

import dao.ComentarioDao;
import datos.Comentario;
import datos.Employee;
import datos.Ticket;

import java.util.Date;

public class ComentarioABM {
    private ComentarioDao comentarioDao = new ComentarioDao();

    public int agregar(String contenido, Ticket ticket,Employee employee) throws Exception {
    	 Date fechaCreacion = new Date();
		if (contenido == null || contenido.isEmpty()) {
			throw new Exception("El contenido del comentario no puede estar vacío.");
		}
		if (ticket == null) {
			throw new Exception("El ticket asociado no puede ser nulo.");
		}
		if (employee == null) {
			throw new Exception("El empleado asociado no puede ser nulo.");
		}
		
    	Comentario comentario = new Comentario(contenido, fechaCreacion, ticket,employee);
        return comentarioDao.agregar(comentario);
    }

    public Comentario traerPorContenido(String contenido) {
        return comentarioDao.traerPorContenido(contenido);
    }
}
