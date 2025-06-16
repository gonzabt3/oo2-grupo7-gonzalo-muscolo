package negocio;

import dao.StatusDao;
import datos.Status;

import java.util.List;

public class StatusABM {
    StatusDao dao = new StatusDao();

    public Status traer(int idStatus) {
        return dao.traer(idStatus);
    }

    public Status traerPorNombre(String name) {
        return dao.traerPorNombre(name);
    }

    public List<Status> traer() {
        return dao.traer();
    }

    public int agregar(String name, String description) throws Exception {
        Status status = new Status(0, name, description);
        return dao.agregar(status);
    }

    public void actualizar(Status status) throws Exception {
        if (traer(status.getIdStatus()) == null) {
            throw new Exception("Error: el estado no existe.");
        }
        dao.actualizar(status);
    }

    public void eliminar(int idStatus) throws Exception {
        Status status = traer(idStatus);
        if (status == null) {
            throw new Exception("Error: el estado no existe.");
        }
        dao.eliminar(status);
    }
}
