package negocio;

import java.util.List;
import dao.AreaDao;
import datos.Area;

public class AreaABM {
    AreaDao dao = new AreaDao();

    public Area traer(int idArea) {
        return dao.traer(idArea);
    }

    public List<Area> traer() {
        return dao.traer();
    }

    public int agregar(String nombre, String descripcion) throws Exception {
        Area objeto = new Area(nombre, descripcion);
        return dao.agregar(objeto);
    }

    public void actualizar(Area area) throws Exception {
        if (traer(area.getIdArea()) == null) {
            throw new Exception("Error: el área asignada no existe.");
        }
        dao.actualizar(area);
    }

    public void actualizarNombre(Area area, String nombre) throws Exception {
        area.setNombre(nombre);
        actualizar(area);
    }

}
