package dao;

import datos.Area;

public class AreaDao extends Dao<Area> {

	public Area traerPorArea(String area) {
		Area objeto = new datos.Area();
		try {
			iniciaOperacion();
			objeto = (Area) session.createQuery("from Area a where a.area =:area")
					.setParameter("area", area).uniqueResult();
		} finally {
			session.close();
		}
		return objeto;
	}

}